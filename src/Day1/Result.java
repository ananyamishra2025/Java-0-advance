package Day1;
import java.util.Scanner;

public class Result {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your CGPA: ");
        double cgpa = sc.nextDouble();
        System.out.println("Hello "+ name +", You are "+ age +" years old and Your CGPA is "+ cgpa);
    }
}
