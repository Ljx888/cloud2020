/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: GatewayMain9527
 * Author:   Administrator
 * Date:     2020/7/20 0020 12:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cpm.gx.yulin.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/20 0020
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayMain9527 {
    public static void main(String[] args){
        SpringApplication.run(GatewayMain9527.class, args);
    }
}
