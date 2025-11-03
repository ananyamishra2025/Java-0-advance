import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();

        float sum = num1 + num2;

        System.out.println("The Sum is " + sum);
    }
}
