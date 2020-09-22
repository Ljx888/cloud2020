/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: OrderDao
 * Author:   Administrator
 * Date:     2020/9/18 0018 20:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.wuzhou.order.dao;

import com.gx.wuzhou.order.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/9/18 0018
 * @since 1.0.0
 */
@Mapper
public interface OrderDao {
    //1. 新建订单
    public void create(Order order);

    //2. 修改新的状态, 从0改为1
    public void update(@Param("userId") Long userId, @Param("status") Integer status);


}
