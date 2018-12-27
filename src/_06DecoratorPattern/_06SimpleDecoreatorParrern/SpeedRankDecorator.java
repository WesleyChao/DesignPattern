package _06DecoratorPattern._06SimpleDecoreatorParrern;

public class SpeedRankDecorator extends Decorator {
    public SpeedRankDecorator(CarInfo i) {
        super(i);
    }

    @Override
    public void displayCarInfo() {
        super.displayCarInfo();
        System.out.println("这个车百公里加速快，外观吊炸天，装逼神器啊，大兄弟");

    }
    @Override
    public void signContract(String customerName) {
        super.signContract(customerName);
    }
}
