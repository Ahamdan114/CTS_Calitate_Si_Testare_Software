package Liskov_Substitution_Example;

public class Circle extends Shape {

    protected Circle(double height, double width) {
        super(height, width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
}
