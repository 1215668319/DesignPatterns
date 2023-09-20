package com.zyao.designpatterns.simplefactory;

/**
 * @author zyao
 * @version 1.0
 * @date 2023/9/20 10:45
 * @Description 正方形实体类
 */
public class ZRectangle extends Rectangle{

    public ZRectangle(int width) {
        this.width = width;
    }

    @Override
    void draw() {
        System.out.println("正方形绘制");
    }

    @Override
    void erase() {
        System.out.println("正方形擦除");
    }
}
