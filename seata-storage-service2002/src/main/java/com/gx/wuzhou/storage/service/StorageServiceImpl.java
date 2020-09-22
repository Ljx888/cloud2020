/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: StorageServiceImpl
 * Author:   Administrator
 * Date:     2020/9/20 0020 23:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.wuzhou.storage.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/9/20 0020
 * @since 1.0.0
 */
@Service
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageService storageService;
    @Override
    public void decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
    }
}
