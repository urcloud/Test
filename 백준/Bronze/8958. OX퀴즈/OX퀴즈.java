import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        for (int i = 0; i < testCaseCount; i++) {
            String quizResult = scanner.nextLine();
            int score = calculateScore(quizResult);
            System.out.println(score);
        }
    }

    public static int calculateScore(String quizResult) {
        int score = 0; // 총 점수
        int consecutiveO = 0; // 연속된 'O'의 개수를 저장하는 변수

        for (int i = 0; i < quizResult.length(); i++) {
            if (quizResult.charAt(i) == 'O') {
                consecutiveO++; // 'O'가 연속될 경우 개수를 증가시킴
                score += consecutiveO; // 현재 'O'의 점수를 총 점수에 더함
            } else {
                consecutiveO = 0; // 'X'를 만나면 연속된 'O'의 개수를 초기화
            }
        }

        return score;
    }
}
