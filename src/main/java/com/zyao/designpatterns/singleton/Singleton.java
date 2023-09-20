package com.zyao.designpatterns.singleton;

/**
 * @author zyao
 * @version 1.0
 * @date 2023/9/19 16:36
 * @Description 静态内部类实现单例模式(解决饿汉式占用资源的问题, 同时也解决了懒汉式运行时性能低的问题)
 */
public class Singleton {

    private Singleton(){}

    private static class HandelSingleton{
        private final static  Singleton instance = new Singleton();
    }

    public static Singleton getInsatnce() {
        return HandelSingleton.instance;
    }

    public static void main(String[] args) {
        Singleton s1,s2;
        s1 = Singleton.getInsatnce();
        s2 = Singleton.getInsatnce();
        System.out.println(s1 == s2);
    }
}
