package Liskov_Substitution_Example;

public abstract class Shape {
    private double height;
    private double width;

    protected Shape(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
}


