import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 시험 본 과목의 개수 입력
        int N = scanner.nextInt();

        // 세준이의 현재 성적을 저장할 배열
        int[] scores = new int[N];

        // 최댓값 초기화
        int maxScore = 0;

        // 성적 입력 및 최댓값 찾기
        for (int i = 0; i < N; i++) {
            scores[i] = scanner.nextInt();
            maxScore = Math.max(maxScore, scores[i]);
        }

        // 세준이의 현재 성적을 새로운 기준으로 변환하고 평균 계산
        double sum = 0;
        for (int score : scores) {
            sum += (double) score / maxScore * 100;
        }
        double average = sum / N;

        // 결과 출력
        System.out.println(average);

        scanner.close();
    }
}
