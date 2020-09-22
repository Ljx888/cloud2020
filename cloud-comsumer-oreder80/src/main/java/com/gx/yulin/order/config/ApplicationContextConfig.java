/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: ApplicationContextConfig
 * Author:   Administrator
 * Date:     2020/7/14 0014 17:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/14 0014
 * @since 1.0.0
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    //@LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}


