package com.zyao.designpatterns.singleton;

/**
 * @author zyao
 * @version 1.0
 * @date 2023/9/19 16:26
 * @Description 懒汉式单例模式, 双重检查锁定来确保唯一性
 */
public class LazySingleton {
    private volatile LazySingleton instance = null; // volatile 只能jdk1.5以上使用,被修饰的变量确保多线程能正确处理

    // 私有化构造函数
    private LazySingleton() {}

    public LazySingleton getInstance() {

        // 第一次判重
        if(instance == null){
            synchronized (LazySingleton.class){
                // 第二次判重
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }


    public static void main(String[] args) {
        Singleton s1,s2;
        s1 = Singleton.getInsatnce();
        s2 = Singleton.getInsatnce();
        System.out.println(s1 == s2);
    }
}
