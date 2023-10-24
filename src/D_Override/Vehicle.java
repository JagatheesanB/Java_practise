package D_Override;

public class Vehicle {
    public Vehicle() {
    }

    // when pass method in constructor ,empty constructor is needed .
    public Vehicle(int b) {
        System.out.println("Contructor called" + b);
    }

    // Encapsulation takes place here
    private int wheels = 4;

    //    Method Overriding
    void getColor() {
        System.out.println("Black");
    }

    void getWheels() {
        System.out.println("Wheels :" + wheels);
    }
}
