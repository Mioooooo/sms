package edu.fjut.ywj.Test;

import edu.fjut.ywj.dao.Blog;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.Test.CharTest
 * Date: Created in 2018/5/15 15:01
 */
@Controller
public class CharTest {
    @RequestMapping("test1")
    public void Test( HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String username =request.getParameter("id");
        System.out.println(username);

    }

    @Test
    public void TestA(){
        Blog blog=new Blog();
        blog.setMainText("sdafak十大发射点法撒旦发阿斯蒂法撒旦法撒旦法撒旦法撒旦艾弗森的ls;ssssssssssssssssssssssssssssssssssssssssadfsadfasdfasdkl;fjasdl;kfjlaks;djflkasdjfl;asjd;fljasdl;fjasldkfjl;kasd");
        System.out.println(blog.getMainText());
    }
}
