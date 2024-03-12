import java.util.*;

public class Calculator
{
    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }
    public static int add(int num1, int num2)
    {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int num1 = input();
        int num2 = input();

        int result = add(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
