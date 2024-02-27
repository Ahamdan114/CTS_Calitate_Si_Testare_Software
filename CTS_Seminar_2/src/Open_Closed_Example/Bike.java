package Open_Closed_Example;

public class Bike extends Vehicle {

    @Override
    public double calculate(Vehicle vehicle) {
        return vehicle.getValue() * 0.5;
    }
}
