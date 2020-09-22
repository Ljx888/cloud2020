/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: GatewayConfig
 * Author:   Administrator
 * Date:     2020/7/20 0020 14:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cpm.gx.yulin.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/20 0020
 * @since 1.0.0
 */
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder route = routeLocatorBuilder.routes();
        route.route("path_route_yulin", r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();

        return route.build();
    }
}
