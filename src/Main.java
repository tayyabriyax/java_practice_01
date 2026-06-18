public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Revo");
        System.out.println(car.name);

        Car electricCar = new ElectricCar("Tesla", "Model S");
        System.out.println(electricCar.name);

        Car gasolineCar = new GasolineCar("Honda", "Civic");
        System.out.println(gasolineCar.name);
    }
}

class Car {
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
        super();
    }

    GasolineCar(String name) {
        super(name);
    }

    GasolineCar() {
        super();
    }
}