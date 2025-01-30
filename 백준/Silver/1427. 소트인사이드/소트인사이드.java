import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        scanner.close();

        Character[] digits = new Character[n.length()];
        for (int i = 0; i < n.length(); i++) {
            digits[i] = n.charAt(i);
        }

        Arrays.sort(digits, Collections.reverseOrder());

        for (char digit : digits) {
            System.out.print(digit);
        }
    }
}
