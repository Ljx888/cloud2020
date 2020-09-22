/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: StotageController
 * Author:   Administrator
 * Date:     2020/9/20 0020 23:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.wuzhou.storage.controller;

import com.gx.wuzhou.storage.domain.CommonResult;
import com.gx.wuzhou.storage.service.StorageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/9/20 0020
 * @since 1.0.0
 */
@RestController
public class StorageController {
    @Resource
    private StorageService storageService;

    //扣减库存
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count){
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功");
    }
}
