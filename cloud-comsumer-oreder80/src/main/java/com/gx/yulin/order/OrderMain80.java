/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: OrderMain
 * Author:   Administrator
 * Date:     2020/7/14 0014 17:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.order;

import com.gx.yulin.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/14 0014
 * @since 1.0.0
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)  //本注解主要用户获取生产者，自己配置的转化方法
public class OrderMain80 {
    public static void main(String[] args){
        SpringApplication.run(OrderMain80.class, args);
        System.out.println("马斌基吃屎");
    }
}
