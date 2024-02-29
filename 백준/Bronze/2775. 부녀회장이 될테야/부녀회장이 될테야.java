import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int k = scanner.nextInt(); // 층 수
            int n = scanner.nextInt(); // 호 수
            System.out.println(countPeople(k, n));
        }
        scanner.close();
    }

    // k층의 n호에 살고 있는 사람 수를 구하는 재귀 함수
    public static int countPeople(int k, int n) {
        if (k == 0) { // 0층의 경우 n호에는 n명이 산다.
            return n;
        } else if (n == 1) { // 1호의 경우 모든 층에 1명씩 산다.
            return 1;
        } else { // 재귀적으로 아래 층의 같은 호부터 1호까지의 사람 수의 합을 구함
            return countPeople(k - 1, n) + countPeople(k, n - 1);
        }
    }
}
