import java.util.Scanner;

class Triangle extends GeometricObject {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the three sides of the triangle: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        System.out.print("Enter the color of the triangle: ");
        String color = scanner.next();

        System.out.print("Enter true or false for filled: ");
        boolean filled = scanner.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        System.out.println("The area of the triangle is: " + triangle.getArea());
        System.out.println("The perimeter of the triangle is: " + triangle.getPerimeter());
        System.out.println("The color of the triangle is: " + triangle.getColor());
        System.out.println("The triangle is filled: " + triangle.isFilled());
    }
}

/* Simple use:
Enter the three sides of the triangle: 3 4 5
Enter the color of the triangle: red
Enter true or false for filled: true
The area of the triangle is: 6.0
The perimeter of the triangle is: 12.0
The color of the triangle is: red
The triangle is filled: true
*/