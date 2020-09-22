/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: AccountDao
 * Author:   Administrator
 * Date:     2020/9/21 0021 8:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.wuzhou.account.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/9/21 0021
 * @since 1.0.0
 */
@Mapper
public interface AccountDao {
    /**
     * 扣账户余额
     * @param userId
     * @param money
     */
    public void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
