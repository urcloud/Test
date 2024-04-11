import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 두 자연수 A와 B를 입력받음
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // A+B 출력
        System.out.println(A + B);
        // A-B 출력
        System.out.println(A - B);
        // A*B 출력
        System.out.println(A * B);
        // A/B 출력 (몫)
        System.out.println(A / B);
        // A%B 출력 (나머지)
        System.out.println(A % B);
        
        scanner.close();
    }
}
