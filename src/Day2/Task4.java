package Day2;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        boolean valid = (age >= 18 && age <= 60);

        if (valid) {
            System.out.println("Age is valid (between 18 and 60)");
        } else {
            System.out.println("Age is NOT valid");
        }
    }
}
