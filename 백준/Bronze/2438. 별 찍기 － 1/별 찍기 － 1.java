import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // N 입력 받기
        int N = scanner.nextInt();
        
        // 별 출력
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
        
        scanner.close();
    }
}
