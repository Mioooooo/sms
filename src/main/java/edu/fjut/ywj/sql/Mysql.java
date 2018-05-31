package edu.fjut.ywj.sql;

import org.junit.Test;

import java.io.*;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.sql.Mysql
 * Date: Created in 2018/5/20 21:09
 */

public class Mysql {


    @Test
    public void TestA() throws Exception {

        File file=new File("E:\\SQL.sql");
        StringBuilder stringBuilder=new StringBuilder();

        OutputStream os=new FileOutputStream(file,true);

        for(int i =10;i<=1000000000;i++){
            stringBuilder.replace(0,stringBuilder.length(),"");
           stringBuilder.append("INSERT INTO test(id) VALUE("+ i +");\n");
            String str=new String(stringBuilder);
            os.write(str.getBytes());
        }

//        StringBuilder stringBuilder=new StringBuilder("ssss");
//
//        stringBuilder.replace(0,stringBuilder.length()+1,"aaa");
//
//        System.out.println(stringBuilder);
    }

//    public static void main(String[] arg) throws IOException, InterruptedException {
//        File file=new File("E:\\SQL.sql");
//        StringBuilder stringBuilder=new StringBuilder();
//
//        OutputStream os=new FileOutputStream(file);
//        Thread.sleep(30000L);
//        for(int i =10;i<=1000000000;i++){
//            stringBuilder.append("INSERT INTO test(id) VALUE("+ i +");\n");
//
//        }
//        String str=new String(stringBuilder);
//        os.write(str.getBytes());
//    }
}
