/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: ConfigMain3344
 * Author:   Administrator
 * Date:     2020/7/21 0021 9:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/21 0021
 * @since 1.0.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigMain3344 {
    public static void main(String[] args){
        SpringApplication.run(ConfigMain3344.class, args);
    }
}
