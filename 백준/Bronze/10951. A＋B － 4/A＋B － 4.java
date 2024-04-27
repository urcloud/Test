import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스 입력
        while (scanner.hasNextInt()) {
            // A와 B 입력
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            // A와 B를 더한 값을 출력
            System.out.println(A + B);
        }

        // Scanner 닫기
        scanner.close();
    }
}
