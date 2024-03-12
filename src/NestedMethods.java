import  java.util.*;
public class NestedMethods
{
    int perimeter(int l, int b, int h)
    {
        int p = 4 * (l + b + h);
        return p;
    }
    int area(int l, int b, int h)
    {
        int p = perimeter(l,b,h);
        System.out.println("Perimeter of cuboid is: " + p);

        int a = 2 * (l * b + b * h + h * l);
        return  a;
    }
    int volume(int l, int b, int h)
    {
        int a = area(l,b,h);
        System.out.println("Area of cuboid is: " + a);

        int v =  l * b * h;
        return  v;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length: ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int b = sc.nextInt();
        System.out.println("Enter the height: ");
        int h = sc.nextInt();

        NestedMethods nm = new NestedMethods();

        int volume = nm.volume(l,b,h);

        System.out.println("Volume of cuboid is: " + volume);
    }
}
