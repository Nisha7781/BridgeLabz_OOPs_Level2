import java.util.Scanner;

class Shape
{
    double length;
    double breadth;

    Shape(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
}

class AreaCalculator
{
    static double calculateRectangleArea(Shape rectangle)
    {
        return rectangle.length * rectangle.breadth;
    }

    static double calculateTriangleArea(Shape triangle)
    {
        return 0.5 * triangle.length * triangle.breadth;
    }
}

public class Area
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth of the rectangle:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        System.out.println("Enter base and height of the triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        Shape rectangle = new Shape(length, breadth);
        Shape triangle = new Shape(base, height);

        double rectangleArea = AreaCalculator.calculateRectangleArea(rectangle);
        System.out.println("Area of Rectangle: " + rectangleArea);

        double triangleArea = AreaCalculator.calculateTriangleArea(triangle);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}
