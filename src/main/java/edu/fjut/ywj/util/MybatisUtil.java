package edu.fjut.ywj.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.InputStream;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.util.MybatisUtil
 * Date: Created in 2018/5/10 15:53
 */

public class MybatisUtil {

    private MybatisUtil(){

    }

    public static SqlSession getSqlSession() throws Exception{
        String resource="mybatis-config.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        return sqlSession;
    }
}
