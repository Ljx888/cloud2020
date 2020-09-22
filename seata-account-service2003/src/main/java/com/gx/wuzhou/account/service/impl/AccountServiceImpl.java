/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: AccountServiceImpl
 * Author:   Administrator
 * Date:     2020/9/21 0021 8:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.wuzhou.account.service.impl;

import com.gx.wuzhou.account.dao.AccountDao;
import com.gx.wuzhou.account.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/9/21 0021
 * @since 1.0.0
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        System.out.println("account-service中扣减账户余额开始");
        accountDao.decrease(userId, money);
        System.out.println("account-service中扣减账户余额结束");
    }
}
