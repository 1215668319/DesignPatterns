package com.zyao.designpatterns.simplefactory;

/**
 * @author zyao
 * @version 1.0
 * @date 2023/9/20 10:36
 * @Description 工厂类
 */
public class RectangleFactory {
    public static SRectangle createSRectangle(int a,int b,int c){
       return new SRectangle(a,b,c);
    }
    public static ZRectangle createZRectangle(int width){
        return new ZRectangle(width);
    }
    public static YRectangle createYRectangle(int r){
        return new YRectangle(r);
    }
}
