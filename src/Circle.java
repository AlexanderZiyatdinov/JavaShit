import java.util.Scanner;

class Circle extends GeometricObject {
    private final double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isFilled(){
        return this.filled;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the color of the circle: ");
        String color = scanner.next();

        System.out.print("Enter true or false for filled: ");
        boolean filled = scanner.nextBoolean();

        Circle circle = new Circle(radius, color, filled);

        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The perimeter of the circle is: " + circle.getPerimeter());
        System.out.println("The color of the circle is: " + circle.getColor());
        System.out.println("The circle is filled: " + circle.isFilled());
    }
}

/*
Simple use:
Enter the radius of the circle: 5
Enter the color of the circle: blue
Enter true or false for filled: true
The area of the circle is: 78.53981633974483
The perimeter of the circle is: 31.41592653589793
The color of the circle is: blue
The circle is filled: true
 */