import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for(int i=0; i<N; i++) {
            long a = scanner.nextLong();
            System.out.println(prime(a));
        }
        
        scanner.close();
    }

    private static long prime(long a) {
        if (a <= 2) return 2; // 2보다 작은 경우, 가장 작은 소수인 2 반환
        if (a % 2 == 0) a++; // 짝수라면 홀수로 변경 (2 제외)

        while (!isPrime(a)) {
            a += 2; // 홀수만 검사 (짝수는 소수 아님)
        }
        
        return a;
    }

    private static boolean isPrime(long b) {
        if (b < 2) return false;
        if (b == 2 || b == 3) return true;
        if (b % 2 == 0) return false;

        for (long i = 3; i * i <= b; i += 2) {
            if (b % i == 0) return false;
        }
        
        return true;
    }
}