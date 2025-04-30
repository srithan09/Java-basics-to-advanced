interface Vehicle {
    void start();
    void stop();
    default void honk() {
        this.start(); // calling another method from default method
        System.out.println("Vehicle honks!");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts.");
    }
    public void stop() {
        System.out.println("Car stops.");
    }
}

public class Default {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.honk(); // calling default method
        myCar.stop();
    }
}