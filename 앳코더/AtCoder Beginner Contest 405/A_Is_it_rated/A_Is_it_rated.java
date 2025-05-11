import java.util.*;

public class A_Is_it_rated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int x = scanner.nextInt();

        boolean isRated = false;

        if (x == 1) {
            isRated = (1600 <= r && r <= 2999);
        } else if (x == 2) {
            isRated = (1200 <= r && r <= 2399);
        }

        System.out.println(isRated ? "Yes" : "No");

        scanner.close();
    }
}