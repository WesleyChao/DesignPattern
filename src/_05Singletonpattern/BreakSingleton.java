package _05Singletonpattern;

import java.lang.reflect.Constructor;


//反射机制破解单例模式（枚举除外）：
//public class BreakSingleton{
//    public static void main(String[] args) throw Exception {
//        Class clazz = Class.forName("Singleton");
//        Constructor c = clazz.getDeclaredConstructor(null);
//
//        c.setAccessible(true);
//
//        Singleton s1 = c.newInstance();
//        Singleton s2 = c.newInstance();
//        //通过反射，得到的两个不同对象
//        System.out.println(s1);
//        System.out.println(s2);
//    }
//}

//如何避免以上的漏洞：
//
//class Singleton{
//    private static final Singleton singleton = new Singleton();
//    private Singleton() {
//        //在构造器中加个逻辑判断,多次调用抛出异常
//        if(instance!= null){
//            throw new RuntimeException()
//        }
//    }
//    public static Singleton getInstance(){
//        return singleton;
//    }
//}