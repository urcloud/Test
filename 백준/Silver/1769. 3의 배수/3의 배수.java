import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        String result = "";

        while (str.length() > 1) {
            int s = 0;
            for (int i = 0; i < str.length(); i++) {
                s += Character.getNumericValue(str.charAt(i));
            }
            str = Integer.toString(s);
            count++;
        }

        if (Integer.parseInt(str) % 3 == 0) {
            result = "YES";
        } else {
            result = "NO";
        }

        System.out.println(count);
        System.out.println(result);
        scanner.close();
    }
}
