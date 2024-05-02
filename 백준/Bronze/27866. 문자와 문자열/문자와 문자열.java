import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 단어 S 입력
        String S = scanner.nextLine();

        // 정수 i 입력
        int i = scanner.nextInt();

        // i번째 글자 출력
        char result = S.charAt(i - 1);
        System.out.println(result);

        // Scanner 닫기
        scanner.close();
    }
}
