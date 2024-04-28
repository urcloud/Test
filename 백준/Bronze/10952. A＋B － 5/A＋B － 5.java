import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력의 마지막에 0 두 개가 들어올 때까지 반복
        while (true) {
            // A와 B 입력
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            // 입력의 마지막 확인
            if (A == 0 && B == 0) {
                break; // 입력의 마지막이면 반복 종료
            }

            // A와 B를 더한 값을 출력
            System.out.println(A + B);
        }

        // Scanner 닫기
        scanner.close();
    }
}
