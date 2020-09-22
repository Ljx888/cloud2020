/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: OrderController
 * Author:   Administrator
 * Date:     2020/7/14 0014 17:15
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.order.controller;

import com.gx.yulin.domain.CommonResult;
import com.gx.yulin.domain.Payment;
import com.gx.yulin.order.lb.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/14 0014
 * @since 1.0.0
 */
@RestController
@Slf4j
public class OrderController {
    // public static final String PAYMENT_URL = "http://localhost:8001"; 单程序版
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancer loadBalancer;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get")
    public CommonResult<Payment> getPayment(int id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get?id="+id, CommonResult.class);
    }

    @GetMapping("/consumer/payment/getForEntity/get")
    public CommonResult<Payment> getPayment2(int id){
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL+"/payment/get?id="+id, CommonResult.class);

        if (entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }else {
            return new CommonResult<>(444, "操作失败");
        }
    }

    /**
     * 自定义轮旋算法
     *
     * @return
     */
    @GetMapping(value = "/consumer/payment/lb")
    public String getPaymentLB(){
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if (instances == null || instances.size() <= 0){
            return null;
        }

        ServiceInstance serviceInstance = loadBalancer.instances(instances);

        URI uri = serviceInstance.getUri();

        return restTemplate.getForObject(uri+"/payment/lb", String.class);
    }
}
