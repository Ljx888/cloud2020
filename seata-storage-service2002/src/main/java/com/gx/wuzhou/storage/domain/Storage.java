/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Stotage
 * Author:   Administrator
 * Date:     2020/9/20 0020 23:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gx.wuzhou.storage.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/9/20 0020
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Storage {
    private Integer id;
    private Long productId;
    private int total;
    private int used;
    private int residue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public int getResidue() {
        return residue;
    }

    public void setResidue(int residue) {
        this.residue = residue;
    }
}
