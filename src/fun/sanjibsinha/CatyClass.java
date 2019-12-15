package fun.sanjibsinha;
/*
class cannot extend multiple classes
so we cannot write like this: public class CatyClass extends MobileClass, MobileFeatures
 */
public class CatyClass extends MobileClass implements MobileUpgradable {

    private double batteryStrength = 0.0;
    private int pixel = 10;
    private double mins = 60.0;
    private int days = 0;
    public double version = 1.0;

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

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

    public CatyClass(){}
    public CatyClass(String name, String color, double price, double mins){
        super(name, color, price);
        this.mins = mins;
    }

}
