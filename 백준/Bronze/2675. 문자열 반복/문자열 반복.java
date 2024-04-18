import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // 테스트 케이스의 개수

        for (int t = 0; t < T; t++) {
            int R = scanner.nextInt(); // 반복 횟수
            String S = scanner.next(); // 문자열

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < S.length(); i++) {
                for (int j = 0; j < R; j++) {
                    result.append(S.charAt(i));
                }
            }

            System.out.println(result.toString());
        }
    }
}
