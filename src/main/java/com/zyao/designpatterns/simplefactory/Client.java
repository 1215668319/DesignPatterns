package com.zyao.designpatterns.simplefactory;

/**
 * @author zyao
 * @version 1.0
 * @date 2023/9/20 11:02
 * @Description 客户端
 */
public class Client {
    public static void main(String[] args) {
        SRectangle rectangle = RectangleFactory.createSRectangle(3, 4, 5);
        rectangle.draw();
        rectangle.erase();
        YRectangle yRectangle = RectangleFactory.createYRectangle(3);
        yRectangle.draw();
        yRectangle.erase();
        ZRectangle zRectangle = RectangleFactory.createZRectangle(5);
        zRectangle.draw();
        zRectangle.erase();
    }
}
