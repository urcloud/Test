import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("#")) break;

            String[] parts = line.split(" ");
            String target = parts[0];
            String guess = parts[1];

            int len = target.length();
            boolean[] targetUsed = new boolean[len];
            boolean[] guessUsed = new boolean[len];

            int black = 0, grey = 0, white = 0;

            for (int i = 0; i < len; i++) {
                if (guess.charAt(i) == target.charAt(i)) {
                    black++;
                    targetUsed[i] = true;
                    guessUsed[i] = true;
                }
            }

            for (int i = 0; i < len; i++) {
                if (guessUsed[i]) continue;

                if (i > 0 && !targetUsed[i - 1] && guess.charAt(i) == target.charAt(i - 1)) {
                    grey++;
                    targetUsed[i - 1] = true;
                    guessUsed[i] = true;
                } else if (i < len - 1 && !targetUsed[i + 1] && guess.charAt(i) == target.charAt(i + 1)) {
                    grey++;
                    targetUsed[i + 1] = true;
                    guessUsed[i] = true;
                }
            }

            for (int i = 0; i < len; i++) {
                if (guessUsed[i]) continue;

                for (int j = 0; j < len; j++) {
                    if (targetUsed[j]) continue;
                    if (Math.abs(i - j) <= 1) continue;
                    if (guess.charAt(i) == target.charAt(j)) {
                        white++;
                        targetUsed[j] = true;
                        guessUsed[i] = true;
                        break;
                    }
                }
            }

            System.out.printf("%s: %d black, %d grey, %d white\n", guess, black, grey, white);
        }
    }
}