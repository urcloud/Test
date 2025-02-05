import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] isPrime = new boolean[1000001];

        for (int i = 2; i <= 1000000; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= 1000000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int count = 0;

        for (int j = 2; j <= N / 2; j++) {
            if (isPrime[j] && isPrime[N - j]) {
                count++;
            }
        }

        System.out.println(count);
    }

        scanner.close();
    }
}
