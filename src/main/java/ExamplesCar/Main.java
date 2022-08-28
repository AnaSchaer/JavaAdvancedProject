package ExamplesCar;

public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        System.out.println(bike.getIdentity());

        Vehicle truck = new Truck();
        System.out.println(truck.getIdentity());

        Vehicle car = new Car();
        System.out.println(car.getIdentity());

        Vehicle []vehicles = new Vehicle[3];
        vehicles[0] = bike;
        vehicles[1] = car;
        vehicles[2] = truck;

        for(Vehicle vehicle: vehicles){
            System.out.println(vehicle.getIdentity());
        }
    }
}
