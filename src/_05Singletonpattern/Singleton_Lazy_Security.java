package _05Singletonpattern;

// 线程安全懒汉模式, 由于加了锁,可能会造成性能问题, 为了解决, 可以使用双重锁
public class Singleton_Lazy_Security {
    private static Singleton_Lazy_Security instance;
    private Singleton_Lazy_Security (){}
    public static synchronized Singleton_Lazy_Security getInstance() {
        if (instance == null) {
            instance = new Singleton_Lazy_Security();
        }
        return instance;
    }
}