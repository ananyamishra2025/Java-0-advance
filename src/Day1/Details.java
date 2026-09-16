package Day1;
import java.util.Scanner;

public class Details {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // creating a new object
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); //reads a line of text
        System.out.println("Enter your age: ");
        int age = sc.nextInt(); //reads an integer
        System.out.println("Hello, "+ name +"! You are "+ age +" years old.");
    }
}
