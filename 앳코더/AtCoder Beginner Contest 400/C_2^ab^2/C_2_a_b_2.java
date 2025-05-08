import java.util.Scanner;

public class C_2_a_b_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long l, r, m, ans = 0;
        final long inf = (long) 1e9;

        l = 0;
        r = inf;
        while ((l + 1) < r) {
            m = (l + r) / 2;
            if ((m * m * 2) <= n) {
                l = m;
            } else {
                r = m;
            }
        }
        ans += l;

        l = 0;
        r = inf;
        while ((l + 1) < r) {
            m = (l + r) / 2;
            if ((m * m * 4) <= n) {
                l = m;
            } else {
                r = m;
            }
        }
        ans += l;

        System.out.println(ans);
    }
}