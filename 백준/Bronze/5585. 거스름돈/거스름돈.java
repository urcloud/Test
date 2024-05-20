import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 타로가 지불할 돈 입력 받기
        int payment = scanner.nextInt();

        // 거스름돈 계산
        int change = 1000 - payment;

        // 잔돈의 개수를 저장할 변수들
        int num500 = change / 500;
        change %= 500;
        int num100 = change / 100;
        change %= 100;
        int num50 = change / 50;
        change %= 50;
        int num10 = change / 10;
        change %= 10;
        int num5 = change / 5;
        change %= 5;
        int num1 = change;

        // 잔돈의 개수 출력
        System.out.println(num500 + num100 + num50 + num10 + num5 + num1);

        scanner.close();
    }
}
