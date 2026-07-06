interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car has Started.");
    }

    public void stop() {
        System.out.println("Car has Stopped.");
    }
}

class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike has Started.");
    }

    public void stop() {
        System.out.println("Bike has Stopped.");
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }
}