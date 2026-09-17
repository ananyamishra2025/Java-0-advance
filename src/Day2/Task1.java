package Day2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quo = a / b;      // integer division
        int rem = a % b;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);
        System.out.println("Quotient = " + quo);
        System.out.println("Remainder = " + rem);
    }
}