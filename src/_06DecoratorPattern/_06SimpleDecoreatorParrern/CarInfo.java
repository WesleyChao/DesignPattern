package _06DecoratorPattern._06SimpleDecoreatorParrern;

public class CarInfo {

    public void displayCarInfo() {
        System.out.println("日本丰田GTR");
        System.out.println("百公里加速1秒");
        System.out.println("油耗偏高");
        System.out.println("后驱涡轮增压");
        System.out.println("内饰豪华");
        System.out.println("发动机噪音偏大");
        System.out.println("不支持电动座椅，后视镜加热");
    }

    public void signContract(String customerName) {
        System.out.println("客户签约销售合同， 付款人：" + customerName);
    }

}
