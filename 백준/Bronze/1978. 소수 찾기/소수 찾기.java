import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 수의 개수 N 입력
        int N = scanner.nextInt();

        int count = 0; // 소수의 개수를 저장할 변수 초기화

        // N개의 수 입력받아 소수인지 판별하여 count 증가
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (isPrime(num)) {
                count++;
            }
        }

        // 소수의 개수 출력
        System.out.println(count);

        scanner.close();
    }

    // 소수인지를 판별하는 함수
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
