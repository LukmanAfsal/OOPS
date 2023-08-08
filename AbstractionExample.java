// Abstract class representing a general shape
abstract class Shape {
    abstract void draw(); // Abstract method with no implementation
}

// Concrete subclass implementing the abstract method
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Concrete subclass implementing the abstract method
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        shape1.draw();  // Calls the draw() method of Circle class
        shape2.draw();  // Calls the draw() method of Square class
    }
}

