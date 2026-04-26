package Day1;
import java.util.Scanner;

public class Goals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Goal: ");
        String first = sc.nextLine();
        System.out.println("Enter Your Second Goal: ");
        String second = sc.nextLine();
        System.out.println("Enter Your Third Goal: ");
        String third = sc.nextLine();
        System.out.println("My Goals are: \n1. "+ first +"\n2. "+ second +"\n3. "+ third);
    }
}
