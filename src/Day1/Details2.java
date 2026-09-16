package Day1;
import java.util.Scanner;

public class Details2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your city: ");
        String city = sc.nextLine();

        System.out.println("Hello "+ name +"! Your age is "+ age +" & city is "+ city +".");
    }
}
