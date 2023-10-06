package com.learnaop.service.impl;

import com.learnaop.dao.AccountDao;
import com.learnaop.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    //    public void showInfo(){
//        System.out.println("test");
//    }
    @Autowired
    private AccountDao accountDao;

    /**
     * 转账
     *
     * @param acNameOut 转出方
     * @param acNameIn  转入方
     * @param money     金额
     */
    @Override
    public void transfer(String acNameOut, String acNameIn, Double money) {
        //
        accountDao.outMoney(acNameOut, money);
//        int i = 1 / 0;  //中间发生异常，
        accountDao.inMoney(acNameIn, money);
    }

    @Override
    public void transJifen() {

    }

}
