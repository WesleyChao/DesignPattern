package _06DecoratorPattern._06SimpleDecoreatorParrern;

public class WheelDeployDecorator extends Decorator {
    public WheelDeployDecorator(CarInfo i) {
        super(i);
    }


    @Override
    public void signContract(String customerName) {
        super.signContract(customerName);

    }


    @Override
    public void displayCarInfo() {
        super.displayCarInfo();

        System.out.println("I am WheelDecorator");

    }
}
