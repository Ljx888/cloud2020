/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: PaymentService
 * Author:   Administrator
 * Date:     2020/7/19 0019 15:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.payment.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/19 0019
 * @since 1.0.0
 */
@Service
public class PaymentService {
    /**
     *
     * 正常访问
     * @param id
     * @return
     */
    public String paymentInfo_Ok(Integer id){
        return "线程池:  "+Thread.currentThread().getName()+"paymentInfo_Ok,id:    "+id+"\t"+"呵呵哒";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfo_TimeOut(Integer id){
        int timeNumber = 5;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        return "线程池:    "+Thread.currentThread().getName()+"  paymentInfo_TimeOut,id:    "+id+"\t"+"呵呵哒"+"耗时+"+timeNumber;
    }

    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池:    "+Thread.currentThread().getName()+"  paymentInfo_TimeOut,id:    "+id+"\t"+"哦豁";
    }

    //===服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"), //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"), // 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), //时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")  //失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(Integer id){
        if (id < 0) {
            throw new RuntimeException("**********id  不能负数");
        }
            String serialNumber = IdUtil.simpleUUID();
            return  Thread.currentThread().getName()+"\t"+"调用成功, 流水号: "+ serialNumber;
    }

    public String paymentCircuitBreaker_fallback(Integer id){
        return "id 不能负数， 请稍后重试  id: "+ id;
    }
}
