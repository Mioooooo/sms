package edu.fjut.ywj.controller;

import edu.fjut.ywj.dao.*;
import edu.fjut.ywj.service.AccountService;
import edu.fjut.ywj.service.BlogService;
import edu.fjut.ywj.service.BlogServiceImpl;
import edu.fjut.ywj.service.CommentService;
import edu.fjut.ywj.util.MyDateConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.controller.BlogController
 * Date: Created in 2018/5/14 2:21
 */
@Controller
public class BlogController {

    @Autowired
    BlogService blogService;

    @Autowired
     CommentService commentService;

    @RequestMapping(value = "/editIndex",method = RequestMethod.GET)
    public ModelAndView blogIndex(ModelAndView modelAndView){
        modelAndView.setViewName("/editIndex");

        return modelAndView;
    }

    @RequestMapping(value="/showMainTextById")
    public ModelAndView showMainTextById(Integer id,ModelAndView modelAndView,HttpSession session){

       BlogView blogView= blogService.selectBlogViewById(id);
        session.setAttribute("blogView",blogView);
        modelAndView.setViewName("/viewIndex");
       return modelAndView;
    }

    @RequestMapping(value = "showMainText",method = RequestMethod.POST)
    @ResponseBody
    public List showMainText(){
        List<Blog> blogs=blogService.selectBlogAll();
        if( blogs.get(0).getTime()!=null){
            blogs.add(0,new Blog());
        }
            return blogs;
    }

    @RequestMapping(value = "addBlog",method = RequestMethod.POST)
    public ModelAndView addBlog(String title,String mainText,HttpSession session) throws ParseException {
        ModelAndView modelAndView=new ModelAndView();
        Blog blog=new Blog();
        blog.setTitle(title);
        blog.setMainText(mainText);
        Account account=(Account)session.getAttribute("account");
        blog.setAccountId(account.getId());
        blog.setBrowseCount(0);
        blog.setTime(MyDateConverter.newDate());
        blogService.addBlog(blog);
        System.out.println(blog.toString());
        modelAndView.setViewName("/hello");
        return modelAndView;
    }

    @RequestMapping(value = "commentText")
    @ResponseBody
    public List commentText(){
        List<Comment> comments=commentService.selectCommentAll();
//        if( comments.get(0).getTime()!=null){
//            comments.add(0,new Comment());
//        }
        System.out.println(comments.toString());
        return comments;

    }

    @RequestMapping(value = "commentTextById")
    @ResponseBody
    public List commentTextById(HttpSession session){
        BlogView blogView= (BlogView) session.getAttribute("blogView");
        List<CommentView> commentViews=commentService.selectCommentById(blogView.getId());

        return commentViews;

    }


}
