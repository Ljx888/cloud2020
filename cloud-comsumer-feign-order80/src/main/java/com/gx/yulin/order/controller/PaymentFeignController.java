/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: PaymentFeignController
 * Author:   Administrator
 * Date:     2020/7/17 0017 22:20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.order.controller;

import com.gx.yulin.domain.CommonResult;
import com.gx.yulin.domain.Payment;
import com.gx.yulin.order.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/17 0017
 * @since 1.0.0
 */
@RestController
public class PaymentFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get")
    public CommonResult<Payment> getPaymentByUd(int id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeoue(){
        return paymentFeignService.paymentFeignTimeoue();
    }
}
