import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        HashSet<Integer> cs = new HashSet<>();

        for (int i = 0; i < N; i++) {
            cs.add(scanner.nextInt());
        }

        int M = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int num = scanner.nextInt();
            sb.append(cs.contains(num) ? "1 " : "0 ");
        }

        System.out.println(sb);

        scanner.close();
    }
}
