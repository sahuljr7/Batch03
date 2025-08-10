package assignment;

// Base class
class Shape {
    double getArea() {
        return 0.0; // Default area for an undefined shape
    }
}

// Subclass of Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding getArea method
    @Override
    double getArea() {
        return length * width;
    }
}

// Main class
public class Program3 {

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5.0, 3.0);
        System.out.println("Area of Rectangle: " + myRectangle.getArea());  // Output: 15.0
    }
}
