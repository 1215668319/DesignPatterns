package com.zyao.designpatterns.methodfactory;

import com.zyao.designpatterns.utils.XMLUtil;

/**
 * @author zyao
 * @version 1.0
 * @date 2023/9/20 14:38
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        ImageFactory factory = null;
        factory = (ImageFactory) XMLUtil.getBean();
        factory.read();
//        factory.createImage().read();
    }
}
