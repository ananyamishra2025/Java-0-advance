public class Q5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                continue;   // skip odd numbers
            }
            System.out.print(i + " ");
        }
    }
}
