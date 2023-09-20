package com.zyao.designpatterns.singleton;

import sun.security.ec.ECDHKeyAgreement;

/**
 * @author zyao
 * @version 1.0
 * @date 2023/9/19 16:21
 * @Description 饿汉式单例模式,当类被加载时,静态变量instance会被初始化,
 * 此时类的私有构造函数会被调用单例类的唯一实例将被创建(构造方法私有化是为了类不能用new 关键字创建)
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public EagerSingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton s1,s2;
        s1 = Singleton.getInsatnce();
        s2 = Singleton.getInsatnce();
        System.out.println(s1 == s2);
    }
}

