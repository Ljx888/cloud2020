/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: SendMessageController
 * Author:   Administrator
 * Date:     2020/7/21 0021 19:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.provider.controller;

import com.gx.yulin.provider.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/21 0021
 * @since 1.0.0
 */
@RestController
public class SendMessageController {
    @Autowired
    public IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }
}
