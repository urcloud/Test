import java.util.Scanner;

public class D_Cubes {
    static long sol(long a, long b, long c) {
        long l = 0, r = 600000001;
        while (r - l > 1) {
            long mid = (l + r) / 2;
            if (a * mid * mid + b * mid + c <= 0)
                l = mid;
            else
                r = mid;
        }
        if (a * l * l + b * l + c == 0)
            return l;
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();
        
        for (long d = 1; d * d * d <= n; ++d) {
            if (n % d != 0)
                continue;
            long m = n / d; // = 3*k^2 + 3*dk + d^2
            long k = sol(3, 3 * d, d * d - m);
            if (k > 0) {
                System.out.println((k + d) + " " + k);
                return;
            }
        }
        System.out.println(-1);
    }
}