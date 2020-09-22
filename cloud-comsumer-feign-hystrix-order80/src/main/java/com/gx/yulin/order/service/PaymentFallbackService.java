/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: PaymentFallbackService
 * Author:   Administrator
 * Date:     2020/7/19 0019 16:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.order.service;

import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/19 0019
 * @since 1.0.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_Ok(Integer id) {
        return "------ PaymentFallbackService fall back-paymentInfo_Ok";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------ PaymentFallbackService fall back-paymentInfo_TimeOut";
    }
}
