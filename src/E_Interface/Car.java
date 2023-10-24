package E_Interface;

public class Car implements IVehicle {

    void drive() {
        System.out.println("Iam Waiting!!!");
    }

    // Generally Interface should have access modifier ,
    public void stop() {
        System.out.println("Stop Here!!!");
    }

    public void start() {
        System.out.println("Start Car!!!");
    }
}
