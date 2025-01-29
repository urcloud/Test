import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        //조합 사용 문제
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            System.out.println(combination(M, N));
        }
        
        scanner.close();
    }

    public static long combination(int M, int N) {
        if (N == 0 || N == M) return 1;
        if (N == 1) return M;

        long result = 1;
        for (int i = 0; i < N; i++) {
            result *= (M - i);
            result /= (i + 1); //나눗셈 같이 사용해서 오버플로우 방지
        }
        return result;
    }
}