interface Shape {
    double getArea();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Corrected multiplication operator
    }
}

public class Ex81 {
    public static void main(String[] args) {
        // Create instances of Circle with different radii
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.5);

        // Calculate and print the area of each circle
        System.out.println("Area of Circle 1 with radius 5.0: " + circle1.getArea());
        System.out.println("Area of Circle 2 with radius 7.5: " + circle2.getArea());
    }
}
