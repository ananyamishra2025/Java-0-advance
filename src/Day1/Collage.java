package Day1;
import java.util.Scanner;

public class Collage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your course: ");
        String course = sc.nextLine();

        System.out.print("Enter your roll number: ");
        long rollNumber = sc.nextLong();

        System.out.println("Name: "+ name +"\nCourse: "+ course +"\nRoll Number: "+ rollNumber);
    }
}
