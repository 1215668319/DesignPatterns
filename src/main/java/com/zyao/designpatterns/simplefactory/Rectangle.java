package com.zyao.designpatterns.simplefactory;

import lombok.Data;

/**
 * @author zyao
 * @version 1.0
 * @date 2023/9/20 10:34
 * @Description
 */
@Data
public abstract  class Rectangle {
    // 宽
    protected int width = 0;
    // 高
    protected int height = 0;
    // 半径
    protected int r = 0;

    /**
     * 绘制
     */
    abstract void draw();

    /**
     * 擦除
     */
    abstract void erase();
}
