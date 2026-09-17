package Day2;

public class LogicalDemo {
    public static void main(String[] args) {

        int a = 10, b = 20;

        System.out.println(a < b && b > 15); // true
        System.out.println(a > b || b == 20); // true
        System.out.println(!(a == 10));       // false

        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result); // Adult
    }
}
