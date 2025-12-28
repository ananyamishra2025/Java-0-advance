import java.util.Scanner;

public class Q5_PalindromeRecursion {

    static int reverse(int num, int rev) {
        if (num == 0)
            return rev;
        return reverse(num / 10, rev * 10 + num % 10);
    }

    static boolean isPalindrome(int num) {
        return num == reverse(num, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPalindrome(n))
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome");
    }
}
