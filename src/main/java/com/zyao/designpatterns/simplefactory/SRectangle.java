package com.zyao.designpatterns.simplefactory;

import lombok.Data;

/**
 * @author zyao
 * @version 1.0
 * @date 2023/9/20 10:45
 * @Description 三角型实体类
 */
@Data
public class SRectangle extends Rectangle{
    // a
    protected int a = 0;
    // b
    protected int b = 0;
    //c
    protected int c = 0;

    public SRectangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void draw() {
        System.out.println("三角型绘制");
    }

    @Override
    void erase() {
        System.out.println("三角型擦除");
    }
}
