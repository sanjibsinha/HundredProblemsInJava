package fun.sanjibsinha;

public class MobileClass {

    private double height = 0.0;
    private double width = 0.0;
    private double thickness = 0.0;
    private double price = 0.0;
    private String color;
    public String name;

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getThickness() {
        return thickness;
    }
    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    protected double changeHeight(double height){
        this.height = height;
        return height;
    }

    //generic constructor
    public MobileClass(){}

    //more complex constructor
    public MobileClass(String name, String color, double price){
        this.name = name;
        this.color = color;
        this.price = price;
    }
}
