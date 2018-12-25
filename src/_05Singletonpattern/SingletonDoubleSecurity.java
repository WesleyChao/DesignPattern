package _05Singletonpattern;



// 双重锁,  最安全高效的 单例
public class SingletonDoubleSecurity {
    private volatile static SingletonDoubleSecurity singleton;
    private SingletonDoubleSecurity (){}
    public static SingletonDoubleSecurity getSingleton() {
        if (singleton == null) {
            synchronized (SingletonDoubleSecurity.class) {
                if (singleton == null) {
                    singleton = new SingletonDoubleSecurity();
                }
            }
        }
        return singleton;
    }
}