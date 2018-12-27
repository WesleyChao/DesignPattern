package _06DecoratorPattern._06SimpleDecoreatorParrern;

public abstract class Decorator extends CarInfo {
    CarInfo info;
    public  Decorator(CarInfo i){
        info = i;
    }

    @Override
    public void displayCarInfo() {
        super.displayCarInfo();
    }

    @Override
    public void signContract(String customerName) {
        super.signContract(customerName);
    }
}
