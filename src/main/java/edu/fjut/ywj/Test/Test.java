package edu.fjut.ywj.Test;

import edu.fjut.ywj.service.BlogService;
import edu.fjut.ywj.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.Test.Test
 * Date: Created in 2018/5/23 14:17
 */
@Controller
public class Test {

    @Autowired
     TestService testService;

    @Autowired
    BlogService blogService;
    @RequestMapping("test")
    public void Test1(){
        testService.update();
    }
}
