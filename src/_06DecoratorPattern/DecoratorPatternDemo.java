package _06DecoratorPattern;

public class DecoratorPatternDemo {
    /*

    装饰器模式, 着重点时包装,  一般会有一个 abstract 的 Decorator类, 作为装饰的父类,  Decorator抽象类, 会持有一个总的接口的引用  并且  接收一个接口的对象, 作为被装饰者
    在不影响 接口的情况下, 扩展一个 方法的功能, 可以动态的装配
    *一个对象, 可以像评级木一样, 动态的拼装想要的功能
    *装饰模式是继承的一个替代模式
    *
    *  像 javaIO中  FilterInputStream filterInputStreasm = new BufferedInputStream(new FileInputStream(new File("/user/a"))); 这种, 可能就是装饰器模式
    * */


    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(redCircle);
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}