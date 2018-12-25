package _05Singletonpattern;



// 饿汉模式, 线程安全, 但是  没有实现懒加载
public class Singleton_Hungry {
    private static Singleton_Hungry instance = new Singleton_Hungry();
    private Singleton_Hungry (){}
    public static Singleton_Hungry getInstance() {
        return instance;
    }
}