import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int l = str.length();
        String answer = null;

        for (int i = 1; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                String p1 = str.substring(0, i);
                String p2 = str.substring(i, j);
                String p3 = str.substring(j);

                p1 = new StringBuilder(p1).reverse().toString();
                p2 = new StringBuilder(p2).reverse().toString();
                p3 = new StringBuilder(p3).reverse().toString();

                String com = p1 + p2 + p3;

                if (answer == null || com.compareTo(answer) < 0) {
                    answer = com;
                }
            }
        }

        System.out.println(answer);
        scanner.close();
    }
}