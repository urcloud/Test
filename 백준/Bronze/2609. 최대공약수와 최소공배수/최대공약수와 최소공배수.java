import java.util.Scanner;

public class Main {
    // 최대 공약수를 구하는 메소드
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // 최소 공배수를 구하는 메소드
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 두 개의 자연수 입력 받기
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        // 최대 공약수 구하기
        int gcdResult = gcd(num1, num2);
        
        // 최소 공배수 구하기
        int lcmResult = lcm(num1, num2);
        
        // 결과 출력
        System.out.println(gcdResult);
        System.out.println(lcmResult);
        
        scanner.close();
    }
}
