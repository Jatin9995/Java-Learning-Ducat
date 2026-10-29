package Ducat.ducat.Associations;

// Dependent class
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}

class Car {
    private String model;
    private final Engine engine; // parent class is using the properties of Engine class

    public Car(String model, String engineType) {
        this.model = model;
        // Engine is created directly INSIDE Car's constructor
        // Engine is owned by Car // Engine is destroyed when Car is destroyed
        this.engine = new Engine(engineType);
    }

    public String getModel() {
        return model;
    }

    public void displayDetails() {
        System.out.println("Car Model: " + getModel());
        System.out.println("Engine Type: " + engine.getType());
    }

}

public class CompositionDemo {
    public static void main(String[] args) {

        Car mycar = new Car("Ford Mustang", "V8 Engine");
        mycar.displayDetails();

        // Destroy the Car object
        mycar = null;

        mycar.displayDetails(); // Error: Engine is destroyed when Car is destroyed

    }
}
