/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: PaymentController
 * Author:   Administrator
 * Date:     2020/7/19 0019 15:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.payment.controller;

import com.gx.yulin.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/19 0019
 * @since 1.0.0
 */
@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/hystrix/ok/")
    public String paymentInfo_Ok(Integer id){
        String result = paymentService.paymentInfo_Ok(id);
        return result;
    }

    @GetMapping(value = "/payment/hystrix/timeout/")
    public String paymentInfo_TimeOut(Integer id){
        String result = paymentService.paymentInfo_TimeOut(id);
        return result;
    }

    //=======服务熔断
    @GetMapping(value = "/payment/circuit/timeout/")
    public String paymentCircuitBreaker(Integer id){
        String result = paymentService.paymentCircuitBreaker(id);
        return result;
    }
}
