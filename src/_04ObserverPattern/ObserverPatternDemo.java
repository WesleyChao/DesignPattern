package _04ObserverPattern;



/*
** 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。比如，当一个对象被修改时，则会自动通知它的依赖对象。

 * 在这个例子中,  观察者 在初始化的时候, 就将被观察者给 传递了进去,  也可以有其他做法, 比如,  手动给subject.Attach(Observer) 这样的注册
*  1、JAVA 中已经有了对观察者模式的支持类。
* 2、避免循环引用。
* 3、如果顺序执行，某一观察者错误会导致系统卡壳，一般采用异步方式。
* */


public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}