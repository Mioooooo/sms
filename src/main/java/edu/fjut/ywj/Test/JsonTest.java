package edu.fjut.ywj.Test;

import com.mysql.cj.xdevapi.JsonArray;


import org.json.JSONArray;
import org.junit.Test;
import org.json.JSONObject;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.Test.JsonTest
 * Date: Created in 2018/5/11 16:51
 */

public class JsonTest {

    @Test
    public void TestA(){
        Map obj = new HashMap();

        //addProperty是添加属性（数值、数组等）；add是添加json对象

        obj.put("cat", "it");

        obj.put("pop", "pp");

        JSONObject object=new JSONObject(obj);
        System.out.println(object);

    }
}
