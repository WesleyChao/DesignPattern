package _06DecoratorPattern._06SimpleDecoreatorParrern;

public class Demo {

    /*
    * 简略版本的 装饰者模式, 适用于 具体的组件类, 如果只有一个, 则可以去掉抽象组件, 之间让抽象装饰器, 引用组件
    *
    *
    *
    *
    *
    *
    * */


    public static void main(String[] args) {
        CarInfo carInfo = new CarInfo();
        System.out.println("-----------速度排名--------------");
        Decorator decorator = new SpeedRankDecorator(carInfo);
        decorator.displayCarInfo();  // 会调用  SpeedRankDecorator 子类的  方法

        System.out.println("---------汽车驱动-----------");
        decorator = new WheelDeployDecorator(carInfo);
        decorator.displayCarInfo();   // 会调用子类的方法
        //听的很舒服那就买
        decorator.signContract("土豪");


    }


}
