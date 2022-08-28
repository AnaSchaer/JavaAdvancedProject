package ExamplesCar;

public class Car extends Vehicle{

    @Override
    public String getIdentity(final String vehicle) {
        return "This is a cool" + vehicle;
    }

    @Override
    public String getIdentity() {
        return message + "Car";
    }
}
