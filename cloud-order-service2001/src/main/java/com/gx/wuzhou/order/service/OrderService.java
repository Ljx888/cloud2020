/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: OrderService
 * Author:   Administrator
 * Date:     2020/9/18 0018 20:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.wuzhou.order.service;

import com.gx.wuzhou.order.domain.Order;
import org.apache.ibatis.annotations.Param;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/9/18 0018
 * @since 1.0.0
 */
public interface OrderService {
    //1. 新建订单
    public void create(Order order);
}
