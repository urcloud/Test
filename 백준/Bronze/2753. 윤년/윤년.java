import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 연도 입력
        int year = scanner.nextInt();

        // 윤년 여부 확인
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(1); // 윤년일 경우 1 출력
        } else {
            System.out.println(0); // 윤년이 아닐 경우 0 출력
        }
    }
}
