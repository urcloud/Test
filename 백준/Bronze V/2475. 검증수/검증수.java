import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 고유번호의 처음 5자리 숫자를 입력받음
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // 검증수 계산
        int verification = 0;
        for (int i = 0; i < 5; i++) {
            verification += numbers[i] * numbers[i];
        }
        verification %= 10;
        
        // 결과 출력
        System.out.println(verification);
        
        scanner.close();
    }
}
