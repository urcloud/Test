import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scenario = 1;

        while (true) {
            int n = Integer.parseInt(scanner.nextLine().trim());
            if (n == 0) break;

            String[] names = new String[n + 1];
            for (int i = 1; i <= n; i++) {
                names[i] = scanner.nextLine();
            }

            Map<Integer, Integer> earrings = new HashMap<>();
            for (int i = 0; i < 2 * n - 1; i++) {
                String[] input = scanner.nextLine().split(" ");
                int student = Integer.parseInt(input[0]);
                earrings.put(student, earrings.getOrDefault(student, 0) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : earrings.entrySet()) {
                if (entry.getValue() % 2 == 1) {
                    System.out.println(scenario + " " + names[entry.getKey()]);
                    break;
                }
            }
            scenario++;
        }
        scanner.close();
    }
}