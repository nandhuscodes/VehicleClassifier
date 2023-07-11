abstract class Vehicle{
    String vehicleName;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }
    abstract void start();
    abstract void stop();
    /*public void start(){
        System.out.println(vehicleName+" started.");
    }
    public void stop(){
        System.out.println(vehicleName+" stopped.");
    }*/
}
class Car extends Vehicle{
    public Car(String vehicleName){
        super(vehicleName);
    }

    @Override
    void start() {
        System.out.println("Car started");
    }

    @Override
    void stop() {
        System.out.println("Car stopped");
    }
}
class Motorcycle extends Vehicle{
    public Motorcycle(String vehicleName){
        super(vehicleName);
    }

    @Override
    void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    void stop() {
        System.out.println("Motorcycle stopped");
    }

}
public class VehicleClassifier {
    public static void main(String[] args) {
        /*Vehicle vehicle = new Vehicle("Vehicle");
        vehicle.start();
        vehicle.stop();*/
        Car car = new Car("Car");
        car.start();
        car.stop();
        Motorcycle motorcycle = new Motorcycle("Motorcycle");
        motorcycle.start();
        motorcycle.stop();
    }
}
