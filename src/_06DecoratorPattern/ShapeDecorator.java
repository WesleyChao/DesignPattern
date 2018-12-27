package _06DecoratorPattern;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        System.out.println("其实这里啥都不用做, 这个几乎不会被调用, 因为会被重写");
        decoratedShape.draw();
    }
}