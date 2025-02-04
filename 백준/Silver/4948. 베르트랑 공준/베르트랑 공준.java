import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N = scanner.nextInt();
            if (N == 0) break;

            int N2 = 2 * N;
            boolean[] isPrime = new boolean[N2 + 1];

            for (int i = 2; i <= N2; i++) {
                isPrime[i] = true;
            }

            // 에라토스테네스의 체
            for (int i = 2; i * i <= N2; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= N2; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            int count = 0;
            for (int i = N + 1; i <= N2; i++) {
                if (isPrime[i]) {
                    count++;
                }
            }

            System.out.println(count);
        }
        
        scanner.close();
    }
}