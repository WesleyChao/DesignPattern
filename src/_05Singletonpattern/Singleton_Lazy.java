package _05Singletonpattern;

// 线程不安全, 懒汉模式: 什么是线程不安全,  多线程的时候,可能创造出多个实例
public class Singleton_Lazy {
    private static Singleton_Lazy instance;
    private Singleton_Lazy (){}

    public static Singleton_Lazy getInstance() {
        if (instance == null) {
            instance = new Singleton_Lazy();
        }
        return instance;
    }
}