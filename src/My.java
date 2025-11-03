import java.util.Scanner;

public class My {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your course: ");
        String course = sc.nextLine();
        System.out.print("Enter your roll number: ");
        int roll_number = sc.nextInt();

        System.out.println("Name: " + name + ",\nCourse: " + course + ", \nRoll Number: " + roll_number);
    }
}
