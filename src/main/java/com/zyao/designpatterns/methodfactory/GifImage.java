package com.zyao.designpatterns.methodfactory;

/**
 * @author zyao
 * @version 1.0
 * @date 2023/9/20 14:23
 * @Description
 */
public class GifImage implements Image{
    @Override
    public void read() {
        System.out.println("读取Gif图片");
    }
}
