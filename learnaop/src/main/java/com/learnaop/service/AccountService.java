package com.learnaop.service;

import org.springframework.transaction.annotation.Transactional;

//所有方法都要用事务管理
//纳入Spring的事务管理
@Transactional
public interface AccountService {
    /**
     * 转账操作
     *
     * @param out   传出方
     * @param in    转入方
     * @param money 金额
     */
//    配置当前接口方法具有事务！！！！  如果去掉会怎么样？
    // 此方法  要放在事务中执行 ，事务完整性：中途有异常，会回滚
    public void transfer(String out, String in, Double money);

    //传递积分
    public void transJifen();
}
