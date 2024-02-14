import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // N 입력 받기
        scanner.close();
        
        for (int i = 1; i <= N; i++) {  // 1부터 N까지 반복
            // 공백과 별을 조합하여 오른쪽 정렬된 모습으로 출력
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();  // 줄 바꿈
        }
    }
}
