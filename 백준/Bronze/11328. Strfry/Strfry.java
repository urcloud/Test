import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String s1 = input[0];
            String s2 = input[1];

            if (s1.length() != s2.length()) {
                System.out.println("Impossible");
                continue;
            }

            int[] count = new int[26];

            for (int j = 0; j < s1.length(); j++) {
                count[s1.charAt(j) - 'a']++;
                count[s2.charAt(j) - 'a']--;
            }

            boolean possible = true;
            for (int c : count) {
                if (c != 0) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "Possible" : "Impossible");
        }

        scanner.close();
    }
}