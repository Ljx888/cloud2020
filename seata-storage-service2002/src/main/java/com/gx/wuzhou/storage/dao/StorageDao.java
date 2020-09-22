/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: StorageDao
 * Author:   Administrator
 * Date:     2020/9/20 0020 23:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.wuzhou.storage.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/9/20 0020
 * @since 1.0.0
 */
@Mapper
public interface StorageDao {
    //扣减库存
    public void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
