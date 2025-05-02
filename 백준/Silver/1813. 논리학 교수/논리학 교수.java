import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] counts = new int[n];

        for (int i = 0; i < n; i++) {
            counts[i] = scanner.nextInt();
        }

        int maxTrue = -1;

        for (int i = 0; i <= n; i++) {
            int trueCount = 0;

            for (int count : counts) {
                if (count == i) {
                    trueCount++;
                }
            }

            if (trueCount == i) {
                maxTrue = Math.max(maxTrue, i);
            }
        }

        System.out.println(maxTrue);
    }
}
