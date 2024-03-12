import java.util.*;
public class Area_MethodOverloading
{
    void area(int s)
    {
        int square = s * s;
        System.out.println("Area of square is: " + square );
    }
    void area(int a, int b)
    {
        int rectangle = a * b;
        System.out.println("Area of Rectangle is: " + rectangle);

    }
    void area(double r)
    {
        double circle = 3.14 * (r * r);
        System.out.println("Area of circle is: " + circle);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Area_MethodOverloading am = new Area_MethodOverloading();

        System.out.print("Enter side of square: ");
        am.area(sc.nextInt());

        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();
        am.area(length,breadth);

        System.out.print("Enter radius of circle: ");
        am.area(sc.nextDouble());

    }
}
