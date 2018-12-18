package FactoryPattern;


// 工厂模式,  一般是用来创造复杂对象的时候使用的
// 应用实例： 1、您需要一辆汽车，可以直接从工厂里面提货，而不用去管这辆汽车是怎么做出来的，以及这个汽车里面的具体实现。 2、Hibernate 换数据库只需换方言和驱动就可以。
// 一般是 每次增加一个产品的时候, 都需要增加一个具体类和对象实现工厂,
// 何时使用：我们明确地计划不同条件下创建不同实例时。  => 这句话翻译过来就是, 通过参数, 在工厂的方法中 判断创建什么对象
// 注意: 作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度
public class Notes {


}

