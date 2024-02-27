package Open_Closed_Example;

public abstract class Vehicle {
    int value = (int) (Math.random() * 100);

    int getValue() {
        return value;
    }

    public abstract double calculate(Vehicle vehicle);
}
