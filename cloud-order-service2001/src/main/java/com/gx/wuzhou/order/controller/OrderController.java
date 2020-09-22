/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: OrderController
 * Author:   Administrator
 * Date:     2020/9/18 0018 20:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.wuzhou.order.controller;

import com.gx.wuzhou.order.domain.CommonResult;
import com.gx.wuzhou.order.domain.Order;
import com.gx.wuzhou.order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/9/18 0018
 * @since 1.0.0
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200, "订餐创建成功");
    }
}
