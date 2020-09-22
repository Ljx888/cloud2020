/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: PaymentService
 * Author:   Administrator
 * Date:     2020/7/13 0013 16:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.payment.service;

import com.gx.yulin.domain.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/13 0013
 * @since 1.0.0
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentId(int id);
}
