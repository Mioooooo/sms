package edu.fjut.ywj.service;

import edu.fjut.ywj.dao.Test;
import edu.fjut.ywj.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.service.TestServiceImpl
 * Date: Created in 2018/5/23 14:13
 */
@Service
public class TestServiceImpl implements TestService {

    private SqlSession sqlSession=MybatisUtil.getSqlSession();

    final String SQL="edu.fjut.ywj.mapper.TestMapper";

    public TestServiceImpl() throws Exception {
    }

    @Override
    public void add() {
        for(int i=10000001;i<=15000000;i++) {

            sqlSession.insert(SQL + ".add", i);
        }
        sqlSession.commit();
    }

    @Override
    public void update() {
        for(int i=4999999;i<=10000000;i++) {
            Test  test=new Test(new Date().toString(),i);
            sqlSession.insert(SQL + ".update",test);
            if(i % 700000==0){
                sqlSession.commit();
            }
        }
        sqlSession.commit();

    }
}
