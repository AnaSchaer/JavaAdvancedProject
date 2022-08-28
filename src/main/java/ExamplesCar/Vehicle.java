package ExamplesCar;

public abstract class Vehicle {
    int numberOfWheels;
    boolean hasEngine;
    String message = "This is a cool ";

    public Vehicle(){
        numberOfWheels = 1;
    }
    public abstract String getIdentity(String vehicles);
    public abstract String getIdentity();

}
