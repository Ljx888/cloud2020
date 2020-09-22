/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: PaymentHystrixController
 * Author:   Administrator
 * Date:     2020/7/19 0019 15:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.order.controller;

import com.gx.yulin.order.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @@create 2020/7/19 0019
 * @since 1.0.0
 */
@RestController
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {
    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping(value = "/consumer/payment/hystrix/ok/")
    public String paymentInfo_Ok(Integer id){
        String result = paymentHystrixService.paymentInfo_Ok(id);
        return result;
    }

    @GetMapping(value = "/consumer/payment/hystrix/timeout/")
//    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//    })
    @HystrixCommand
    public String paymentInfo_TimeOut(Integer id){
        String result = paymentHystrixService.paymentInfo_TimeOut(id);
        return result;
    }

    public String paymentTimeOutFallbackMethod(Integer id){
        return "我是消费者80，对方支付系统繁忙.请在10秒钟之后再重新试试看";
    }

    //全局global方法
    public String payment_Global_FallbackMethod(){
        return "Global异常处理信息， 请稍后再试";
    }
}
