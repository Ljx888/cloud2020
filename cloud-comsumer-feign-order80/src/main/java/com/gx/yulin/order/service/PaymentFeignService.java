/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: PaymentFeignService
 * Author:   Administrator
 * Date:     2020/7/17 0017 22:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.order.service;

import com.gx.yulin.domain.CommonResult;
import com.gx.yulin.domain.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/17 0017
 * @since 1.0.0
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "payment/get")
    public CommonResult<Payment> getPaymentById(int id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeoue();
}
