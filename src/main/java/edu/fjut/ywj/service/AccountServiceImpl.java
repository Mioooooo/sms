package edu.fjut.ywj.service;

import edu.fjut.ywj.dao.Account;
import edu.fjut.ywj.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.service.AccountServiceImpl
 * Date: Created in 2018/5/10 14:26
 */
@Service
public class AccountServiceImpl implements AccountService {

    SqlSession sqlSession=MybatisUtil.getSqlSession();

    final String SQL="edu.fjut.ywj.mapper.AccountMapper";

    public AccountServiceImpl() throws Exception {
    }

    @Override
    public Account getAccountByNameAndPassword(String name,String password) {
        Account account=new Account(name,password);
        Account account1=sqlSession.selectOne(SQL+".getAccountByNameAndPassword",account);
        return account1;
    }

    @Override
    public Boolean addAccount(Account account) {
        Integer i=sqlSession.insert(SQL+".addAccount",account);
        if(i>0){
            sqlSession.commit();
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean updateAccount(Account account) {
        return false;
    }
}
