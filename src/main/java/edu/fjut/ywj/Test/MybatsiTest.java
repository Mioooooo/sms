package edu.fjut.ywj.Test;

import edu.fjut.ywj.dao.Account;
import edu.fjut.ywj.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.Test.MybatsiTest
 * Date: Created in 2018/5/10 16:25
 */

public class MybatsiTest {

    @Test
    public void TestA() throws Exception {
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        Account account=new Account("ywj","ywj123");
        account =sqlSession.selectOne("edu.fjut.ywj.mapper.AccountMapper.getAccountByNameAndPassword",account);
        System.out.println(account.toString());
    }
}
