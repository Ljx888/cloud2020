/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: EurekaMain7002
 * Author:   Administrator
 * Date:     2020/7/15 0015 9:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/15 0015
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args){
        SpringApplication.run(EurekaMain7002.class, args);
    }
}
