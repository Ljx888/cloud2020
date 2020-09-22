/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: MessageProviderImpl
 * Author:   Administrator
 * Date:     2020/7/21 0021 19:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.provider.service.impl;

import com.gx.yulin.provider.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilderFactory;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import javax.xml.transform.Source;
import java.util.UUID;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/21 0021
 * @since 1.0.0
 */
@EnableBinding(Source.class) // 定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output; //消息发生管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("////"+serial);
        return null;
    }
}
