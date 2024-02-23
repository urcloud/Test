import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 카드의 개수 N과 목표 합 M 입력 받기
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 카드에 쓰여 있는 수 배열에 저장하기
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = scanner.nextInt();
        }

        // 가장 가까운 합을 저장할 변수
        int closestSum = 0;

        // 세 장의 카드를 골라 합이 M을 넘지 않으면서 M에 최대한 가깝게 만들기
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= M && sum > closestSum) {
                        closestSum = sum;
                    }
                }
            }
        }

        // 결과 출력
        System.out.println(closestSum);

        scanner.close();
    }
}
