package fun.sanjibsinha;

/*
class cannot extend multiple classes
so we cannot write like this: public class ZenyClass extends MobileClass, MobileFeatures
 */

public class ZenyClass extends MobileClass {

    private double batteryStrength = 0.0;
    private int pixel = 10;
    private double mins = 60.0;
    private int days = 0;

    public double getBatteryStrength() {
        return batteryStrength;
    }
    public void setBatteryStrength(double batteryStrength) {
        this.batteryStrength = batteryStrength;
    }

    public double getMins() {
        return mins;
    }
    public void setMins(double mins) {
        this.mins = mins;
    }

    public double takeCharge(double mins){
        this.mins = mins;
        return mins;
    }
    public double batteryCanLast(int days){
        this.days = days;
        return days;
    }

    public ZenyClass(){}
    public ZenyClass(String name, String color, double price, double mins){
        super(name, color, price);
        this.mins = mins;
    }
}
