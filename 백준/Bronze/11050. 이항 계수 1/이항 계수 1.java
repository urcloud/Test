import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N과 K 입력 받기
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // 이항 계수 계산
        long binomialCoefficient = calculateBinomialCoefficient(N, K);

        // 결과 출력
        System.out.println(binomialCoefficient);

        scanner.close();
    }

    // 이항 계수를 계산하는 메서드
    public static long calculateBinomialCoefficient(int N, int K) {
        // N! 계산
        long numerator = factorial(N);
        // K! 계산
        long denominator1 = factorial(K);
        // (N-K)! 계산
        long denominator2 = factorial(N - K);

        // 이항 계수 계산
        long binomialCoefficient = numerator / (denominator1 * denominator2);

        return binomialCoefficient;
    }

    // 팩토리얼 계산 메서드
    public static long factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
