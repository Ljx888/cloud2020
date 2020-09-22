/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: ReceiveMessageListnerController
 * Author:   Administrator
 * Date:     2020/7/21 0021 21:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/21 0021
 * @since 1.0.0
 */
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListnerController {
    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("消费者1号    接受到的消息：" +message.getPayload()+"\t port"+ serverPort);
    }
}
