import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 알파벳 소문자, 대문자, 숫자 중 하나를 입력받음
        char ch = scanner.next().charAt(0);

        // 입력받은 문자의 아스키 코드 값을 출력
        int asciiValue = (int) ch;
        System.out.println(asciiValue);

        // Scanner 닫기
        scanner.close();
    }
}
