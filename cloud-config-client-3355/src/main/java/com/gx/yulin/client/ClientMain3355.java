/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: ClientMain3355
 * Author:   Administrator
 * Date:     2020/7/21 0021 14:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/21 0021
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ClientMain3355 {
    public static void main(String[] args){
        SpringApplication.run(ClientMain3355.class, args);
    }
}
