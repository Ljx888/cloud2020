/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: MyLB
 * Author:   Administrator
 * Date:     2020/7/17 0017 13:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.order.lb.Impl;

import com.gx.yulin.order.lb.LoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/17 0017
 * @since 1.0.0
 */
@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);  //原子类

    public final int getAndIncrement(){
        int current;
        int next;

        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current+1;  //整型的最大值
        }while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("*********第几次访问next:"+next);
        return next;
    }
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
