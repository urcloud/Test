import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스의 개수 T 입력 받기
        int T = scanner.nextInt();
        
        // 버퍼 비우기
        scanner.nextLine();

        // T번 반복하며 각 테스트 케이스에 대해 A+B 출력하기
        for (int i = 0; i < T; i++) {
            // A와 B 입력 받기
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            
            // 버퍼 비우기
            scanner.nextLine();

            // A와 B의 합 출력
            System.out.println(A + B);
        }

        // 스캐너 닫기
        scanner.close();
    }
}
