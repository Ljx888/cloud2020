/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: PaymentController
 * Author:   Administrator
 * Date:     2020/7/13 0013 16:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.payment.controller;

import com.gx.yulin.domain.CommonResult;
import com.gx.yulin.domain.Payment;
import com.gx.yulin.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/13 0013
 * @since 1.0.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPost;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "payment/create")
    public CommonResult create(@RequestBody Payment payment){
        System.out.println(payment.toString());
        int result = paymentService.create(payment);

        if (result > 0){
            return new CommonResult(200, "插入数据库成功, server:"+serverPost, result);
        }else {
            return new CommonResult(444, "插入数据库失败");
        }
    }

    @GetMapping(value = "payment/get")
    public CommonResult getPaymentById(int id){
        Payment result = paymentService.getPaymentId(id);

        if (result != null){
            return new CommonResult(200, "查询成功, server:"+serverPost, result);
        }else {
            return new CommonResult(444, "查询失败", null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String list:services){
            System.out.println(list);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances){
            System.out.println(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }

        return this.discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPost;
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeoue(){
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return serverPost;
    }
}
