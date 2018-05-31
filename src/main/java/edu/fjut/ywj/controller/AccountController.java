package edu.fjut.ywj.controller;

import edu.fjut.ywj.dao.Account;
import edu.fjut.ywj.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.controller.AccountController
 * Date: Created in 2018/5/10 14:19
 */
@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;



    public AccountController() throws Exception {
    }
    public AccountService getAccountService() {

        return accountService;
    }


    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(value = "/checkAccount",method = RequestMethod.POST)
    public ModelAndView LoginAccount(String name, String password,HttpSession session){
        ModelAndView modelAndView=new ModelAndView();
        Account account=accountService.getAccountByNameAndPassword(name,password);
        if(account==null){
            modelAndView.setViewName("/loginAccountIndex");
        }else{
            modelAndView.addObject("account",account);
            modelAndView.setViewName("/blogIndex");
            session.setAttribute("account",account);
        }
        return modelAndView;
    }
//
//    @RequestMapping("check")
//    @ResponseBody
//    public Account check(@RequestBody Account account){
//        return account;
//    }

    @RequestMapping(value="/addAccount",method = RequestMethod.POST)
    public ModelAndView addAccount(Account account){
      ModelAndView modelAndView=new ModelAndView();
        if(accountService.addAccount(account)){
            modelAndView.setViewName("/hello");
        }else{
            modelAndView.setViewName("/error");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/loginAccountIndex",method = RequestMethod.GET)
    public String loginAccountIndex(){
        return "/loginAccountIndex";
    }

    @RequestMapping(value = "/addAccountIndex",method = RequestMethod.POST)
    public String addAccountIndex(){
        return "/addAccountIndex";
    }



}
