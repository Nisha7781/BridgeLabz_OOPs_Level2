import java.util.Scanner;

public class SumOfBytes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two byte values:");
        byte b1 = sc.nextByte();
        byte b2 = sc.nextByte();

        int n1 = b1;
        int n2 = b2;

        int sum =  n1 + n2;

        System.out.println("Sum of " + b1 + " and " + b2 + " is: " + sum);
    }
}
