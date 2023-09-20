package com.zyao.designpatterns.methodfactory;

/**
 * @author zyao
 * @version 1.0
 * @date 2023/9/20 14:30
 * @Description
 */
public class GifImageFactory extends ImageFactory {
    @Override
    public Image createImage() {
        return new GifImage();
    }
}
