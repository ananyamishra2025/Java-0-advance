import java.util.Scanner;

public class Q1_EvenOdd {

    static void checkEvenOdd(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        checkEvenOdd(n);
    }
}
