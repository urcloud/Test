import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A1 = scanner.nextInt();
        int B1 = scanner.nextInt();
        int A2 = scanner.nextInt();
        int B2 = scanner.nextInt();

        int lcm = lcm(B1, B2);

        int newA1 = A1 * (lcm / B1);
        int newA2 = A2 * (lcm / B2);

        int sum1 = newA1 + newA2;
        int sum2 = lcm;

        int gcd = gcd(sum1, sum2);
        sum1 /= gcd;
        sum2 /= gcd;

        System.out.println(sum1);
        System.out.println(sum2);
        
        scanner.close();
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}