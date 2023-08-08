class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }

    public void startEngine() {
        System.out.println("Starting the engine.");
    }
}

class Car extends Vehicle {
    private int numOfDoors;

    public Car(String brand, int numOfDoors) {
        super(brand); // Call the constructor of the superclass
        this.numOfDoors = numOfDoors;
    }

    public void displayNumOfDoors() {
        System.out.println("Number of doors: " + numOfDoors);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the car's engine.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 4);

        myCar.displayBrand();      // Accessing a method from the superclass
        myCar.displayNumOfDoors(); // Accessing a method from the subclass
        myCar.startEngine();       // Overridden method from the subclass
    }
}
