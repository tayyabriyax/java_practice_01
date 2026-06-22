public class InterfacePractice {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Revo");
        System.out.println(car.name);

        Car electricCar = new ElectricCar("Tesla", "Model S");
        System.out.println(electricCar.name);
        electricCar.start();

        Car gasolineCar = new GasolineCar("Honda", "Civic");
        System.out.println(gasolineCar.name);
    }
}

interface Vehicle {
    void start();

    void drive();

    void brake();

    void turnOff();
}

class Car implements Vehicle {
    String name;
    String model;

    // Constructors
    Car() {
        this("Unknown", "Unknown");
    }

    Car(String name) {
        this(name, "Unknown");
    }

    Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Car is Started !");
    }

    @Override
    public void drive() {
        System.out.println("Car is Driving !");
    }

    @Override
    public void brake() {
        System.out.println("Car is Braking !");
    }

    @Override
    public void turnOff() {
        System.out.println("Car is Turned OFF !");
    }

}

class ElectricCar extends Car {
    // Constructors
    ElectricCar(String name, String model) {
        super(name, model);
    }

    ElectricCar(String name) {
        super(name);
    }

    ElectricCar() {
        super();
    }
}

class GasolineCar extends Car {
    // Constructors
    GasolineCar(String name, String model) {
        super(name, model);
    }

    GasolineCar(String name) {
        super(name);
    }

    GasolineCar() {
        super();
    }
}