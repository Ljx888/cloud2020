/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: PaymentDashboarMain9001
 * Author:   Administrator
 * Date:     2020/7/20 0020 10:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.dashboar;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/20 0020
 * @since 1.0.0
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class PaymentDashboarMain9001 {
    public static void main(String[] args){
        SpringApplication.run(PaymentDashboarMain9001.class, args);
    }

    /**
     * 此配置是为了服务监控而配置，与服务容错本身无关， springcloud升级后的坑
     * ServletRegistrationBean因为springboot的默认路径不是"/hystrix.stream"
     * 只要在自己的项目里配置上下面的servlet就可以了
     *
     * @return
     */
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean();
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
