package com.zyao.designpatterns.simplefactory;

/**
 * @author zyao
 * @version 1.0
 * @date 2023/9/20 10:45
 * @Description 圆型实体类
 */
public class YRectangle extends Rectangle{

    public YRectangle(int r) {
        this.r = r;
    }

    @Override
    void draw() {
        System.out.println("圆型绘制");
    }

    @Override
    void erase() {
        System.out.println("圆型擦除");
    }
}
