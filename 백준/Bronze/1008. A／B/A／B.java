import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 두 정수 A와 B를 입력 받음
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // A/B를 출력
        double result = (double) A / B;
        System.out.println(result);
        
        scanner.close();
    }
}