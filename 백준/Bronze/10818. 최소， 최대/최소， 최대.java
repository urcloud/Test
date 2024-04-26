import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수의 개수 N 입력
        int N = scanner.nextInt();

        // 정수 배열 생성
        int[] numbers = new int[N];

        // N개의 정수를 배열에 입력
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 최솟값과 최댓값 초기화
        int min = numbers[0];
        int max = numbers[0];

        // 배열을 순회하며 최솟값과 최댓값 갱신
        for (int i = 1; i < N; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // 최솟값과 최댓값 출력
        System.out.println(min + " " + max);

        // Scanner 닫기
        scanner.close();
    }
}
