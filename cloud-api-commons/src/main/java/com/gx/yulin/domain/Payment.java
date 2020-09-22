/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Payment
 * Author:   Administrator
 * Date:     2020/7/14 0014 20:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.yulin.domain;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/7/14 0014
 * @since 1.0.0
 */
public class Payment implements Serializable {
    private int id;
    private String serial;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
