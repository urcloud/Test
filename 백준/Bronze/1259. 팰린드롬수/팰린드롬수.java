import java.util.Scanner;

public class Main {

    // 주어진 숫자가 팰린드롬인지 확인하는 함수
    static boolean isPalindrome(int num) {
        String str = Integer.toString(num); // 숫자를 문자열로 변환
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false; // 대칭되는 문자가 다를 경우 팰린드롬이 아님
            }
        }
        return true; // 모든 대칭되는 문자가 같을 경우 팰린드롬임
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break; // 입력이 0이면 종료
            if (isPalindrome(num)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        scanner.close();
    }
}
