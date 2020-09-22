/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: LoadBalancer
 * Author:   Administrator
 * Date:     2020/7/17 0017 13:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.order.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/17 0017
 * @since 1.0.0
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
