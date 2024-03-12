import java.util.*;

public class ArithmeticSum
{
    void sum(int a, int b )
    {
        int sum = a + b;
        System.out.println("sum of " + a + " and " + b + " is: " + sum );
    }
    void sum(int a, int b, int c )
    {
        int sum = a + b + c;
        System.out.println("sum of " + a + ", " + b + " and " + c + " is: " + sum );
    }
    void sum(int a, int b, int c, int d)
    {
        int sum = a + b + c + d;
        System.out.println("sum of " + a + ", " + b + ", " + c + " and " + d + " is: " + sum );
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArithmeticSum m = new ArithmeticSum();

        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();
        System.out.print("Enter number c: ");
        int c = sc.nextInt();
        System.out.print("Enter number d: ");
        int d = sc.nextInt();

        m.sum(a,b);
        m.sum(a,b,c);
        m.sum(a,b,c,d);

    }
}
