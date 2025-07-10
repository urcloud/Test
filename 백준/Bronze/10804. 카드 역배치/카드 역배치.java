import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] card = new int[21];

        for (int i = 0; i < card.length; i++) {
            card[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int temp = 0;

            for (int j = 0; j < (b - a + 1) / 2; j++) {
                temp = card[a + j];
                card[a + j] = card[b - j];
                card[b - j] = temp;
            }
        }

        for (int i = 1; i < card.length; i++) {
            System.out.printf(card[i] + " ");
        }

        scanner.close();
    }
}