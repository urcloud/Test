import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // A, B, C 입력 받기
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        // A * B * C 계산
        int result = A * B * C;

        // 결과에 각 숫자가 몇 번 나타나는지 저장할 배열 초기화
        int[] count = new int[10];

        // 결과의 각 자리 숫자 count 배열에 저장
        while (result > 0) {
            int digit = result % 10;
            count[digit]++;
            result /= 10;
        }

        // 결과 출력
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }

        // 스캐너 닫기
        scanner.close();
    }
}
