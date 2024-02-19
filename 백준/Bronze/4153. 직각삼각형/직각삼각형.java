import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // 세 변의 길이를 입력받음
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            // 입력이 모두 0이면 종료
            if (a == 0 && b == 0 && c == 0)
                break;
            
            // 세 변의 길이를 제곱하여 가장 큰 값을 찾음
            int max = Math.max(Math.max(a*a, b*b), c*c);
            
            // 가장 큰 값이 나머지 두 변의 제곱의 합과 같으면 직각 삼각형
            if (max == a*a + b*b + c*c - max)
                System.out.println("right");
            else
                System.out.println("wrong");
        }
        
        scanner.close();
    }
}
