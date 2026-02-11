import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        while (true) {
            if (pelindrom(n) == 1 && sosu(n) == 1) {
                System.out.println(n);
                break;
            }
            n++;
        }
        scanner.close();
    }

    public static int pelindrom(int n) {
        int reversed = 0;
        int original = n;
        
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        
        return (original == reversed) ? 1 : 0;
    }

    public static int sosu(int n) {
        if (n < 2) return 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return 0;
        }
        return 1;
    }
}
