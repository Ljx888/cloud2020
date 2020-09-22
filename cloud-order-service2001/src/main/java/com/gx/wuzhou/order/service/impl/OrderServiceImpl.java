/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: OrderServiceImpl
 * Author:   Administrator
 * Date:     2020/9/20 0020 21:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.wuzhou.order.service.impl;

import com.gx.wuzhou.order.dao.OrderDao;
import com.gx.wuzhou.order.domain.Order;
import com.gx.wuzhou.order.service.AccountService;
import com.gx.wuzhou.order.service.OrderService;
import com.gx.wuzhou.order.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/9/20 0020
 * @since 1.0.0
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     * @param order
     */
    @Override
    @GlobalTransactional(name = "fsp-create-order", rollbackFor = Exception.class)
    public void create(Order order) {

        orderDao.create(order);
        System.out.println("订单微服务开始调用库存， 做扣减end");
        storageService.decrease(order.getProductId(), order.getCount());
        System.out.println("订单微服务开始调用账户，做减扣");

        accountService.decrease(order.getUserId(), order.getMoney());

        //修改订单状态， 从0到1,1代表完成
        orderDao.update(order.getUserId(), 0);

        //修改订单状态结束

    }
}
