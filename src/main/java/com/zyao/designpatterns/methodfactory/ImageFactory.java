package com.zyao.designpatterns.methodfactory;

/**
 * @author zyao
 * @version 1.0
 * @date 2023/9/20 14:21
 * @Description 图片抽象工厂父类
 */
public abstract class ImageFactory {
    public void read(){
        Image image = this.createImage();
        image.read();
    }
    public abstract Image createImage();
}
