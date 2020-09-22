/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: PaymentServiceImpl
 * Author:   Administrator
 * Date:     2020/7/13 0013 16:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.payment.service.impl;

import com.gx.yulin.domain.Payment;
import com.gx.yulin.payment.mapper.PaymentMapper;
import com.gx.yulin.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/13 0013
 * @since 1.0.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentId(int id) {
        return paymentMapper.getPaymentId(id);
    }
}
