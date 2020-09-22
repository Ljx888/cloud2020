/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: PaymentHystrixService
 * Author:   Administrator
 * Date:     2020/7/19 0019 15:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/19 0019
 * @since 1.0.0
 */
@Component
@FeignClient(value = "CLOUD-PRIVEDER-HYSTRIX-PAYMENT8001", fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {
    @GetMapping(value = "/payment/hystrix/ok/")
    public String paymentInfo_Ok(Integer id);

    @GetMapping(value = "/payment/hystrix/timeout/")
    public String paymentInfo_TimeOut(Integer id);
}
