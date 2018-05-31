package edu.fjut.ywj.service;

import edu.fjut.ywj.dao.Blog;
import edu.fjut.ywj.dao.BlogView;

import java.util.List;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.service.BlogService
 * Date: Created in 2018/5/15 1:46
 */

public interface BlogService {

    Boolean addBlog(Blog blog);


    List<Blog> selectBlogAll();

    Blog selectBlogById(Integer id);

    BlogView selectBlogViewById(Integer id);

}
