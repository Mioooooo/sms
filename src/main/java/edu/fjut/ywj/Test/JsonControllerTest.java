package edu.fjut.ywj.Test;

import edu.fjut.ywj.dao.Blog;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.Test.JsonControllerTest
 * Date: Created in 2018/5/14 0:56
 */
@Controller
public class JsonControllerTest {
    @RequestMapping("testJson")
    @ResponseBody
    public List Test(HttpServletResponse response,HttpServletRequest request)throws Exception{

        String id="1";
        Map<String, String> obj=new HashMap<String, String>();
        List list =new ArrayList<>();
        list.add(new Blog());
        list.add(new Blog(1,"十大发射点","dsssssssssssssssss","1",1,1));
        list.add(new Blog(1,"asd","ssssssssssssssss","1",1,1));
        list.add(new Blog(1,"2134","sssssssssss1","1",1,1));

        JSONObject object=new JSONObject(list);

        return list;

//        request.setCharacterEncoding("utf-8");
//        ModelAndView mov=new ModelAndView();
//        Map obj = new HashMap();
//
//        //addProperty是添加属性（数值、数组等）；add是添加json对象
//
//        obj.put("cat", "it");
//
//        obj.put("pop", "pp");
//
//        JSONObject object=new JSONObject(obj);
//        mov.addObject("obj",object);
//        mov.setViewName("/hello");
////        System.out.println(object);
////        PrintWriter write = response.getWriter();
////        write.write(object.toString());
////        write.flush();
////        write.close();
////设置输出文本格式为json
//
////        response.setContentType("application/json");
////// 获得输出流对象PrintWriter
////        PrintWriter out = response.getWriter();
////// 输出json对象，这里可以封装用户提取出来的json字符串
////        out.write(object.toString());
////        out.flush();
////        return "/hello";
//        return mov;
    }
}
