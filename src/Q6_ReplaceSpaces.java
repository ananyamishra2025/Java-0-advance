import java.util.Scanner;

public class Q6_ReplaceSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = s.replace(" ", "_");

        System.out.println("Updated string = " + result);
    }
}
