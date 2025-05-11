import java.util.*;

public class B_Not_All {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int remove = 0; remove <= n; remove++) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n - remove; i++) {
                set.add(a[i]);
            }

            boolean allPresent = true;
            for (int x = 1; x <= m; x++) {
                if (!set.contains(x)) {
                    allPresent = false;
                    break;
                }
            }

            if (!allPresent) {
                System.out.println(remove);
                return;
            }
        }

        System.out.println(n);
    }
}