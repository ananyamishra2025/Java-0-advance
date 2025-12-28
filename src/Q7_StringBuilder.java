public class Q7_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}
