package chapter2.part6_1.shop;

public class Battery extends Product {

    private boolean rechargeable;

    public Battery() {
        super();
    }

    public Battery(String name, double price, double discount) {
        super(name, price, discount);
    }

    public boolean getRechargeable() {
        return rechargeable;
    }

    // 게터 및 세터
    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }
}
