/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: ConfigClientController
 * Author:   Administrator
 * Date:     2020/7/21 0021 14:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RefreshScope
public class ConfigClientController {
    @Value("${config.info}")
private String configInfo;

    @GetMapping(value = "/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
