import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count0 = 0;
        int count1 = 0;
        String str = scanner.nextLine();

        if (str.charAt(0) == '0') {
            count0++;
        } else {
            count1++;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                if (str.charAt(i + 1) == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }
        }

        System.out.println(Math.min(count0, count1));

        scanner.close();
    }
}