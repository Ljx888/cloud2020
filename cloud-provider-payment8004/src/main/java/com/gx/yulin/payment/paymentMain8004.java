/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: paymentMain8004
 * Author:   Administrator
 * Date:     2020/7/16 0016 16:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/16 0016
 * @since 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class paymentMain8004 {
    public static void main(String[] agrs){
        SpringApplication.run(paymentMain8004.class, agrs);
    }
}
