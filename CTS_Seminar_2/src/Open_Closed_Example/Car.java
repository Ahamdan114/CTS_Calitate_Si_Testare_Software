package Open_Closed_Example;

public class Car extends Vehicle {

    @Override
    public double calculate(Vehicle vehicle) {
        return vehicle.getValue() * 0.8;
    }
}
