package edu.fjut.ywj.service;

import edu.fjut.ywj.dao.Account;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.service.AccountService
 * Date: Created in 2018/5/10 14:22
 */

public interface AccountService {

    //登录
    Account getAccountByNameAndPassword(String name,String password);

    //注册
    Boolean addAccount(Account account);

    //修改基本信息
    boolean updateAccount(Account account);


}
