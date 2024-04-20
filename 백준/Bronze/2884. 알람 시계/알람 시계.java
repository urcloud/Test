import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        int totalMinutes = H * 60 + M;
        int adjustedMinutes = totalMinutes - 45;

        if (adjustedMinutes < 0) {
            adjustedMinutes += 24 * 60;
        }

        int adjustedHours = adjustedMinutes / 60;
        int adjustedMinutesRemainder = adjustedMinutes % 60;

        System.out.println(adjustedHours + " " + adjustedMinutesRemainder);
    }
}
