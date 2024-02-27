import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            
            // 입력이 0이면 종료
            if (input.equals("0")) {
                break;
            }
            
            // 주어진 수가 팰린드롬수인지 판별
            if (isPalindrome(input)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        
        scanner.close();
    }
    
    // 주어진 문자열이 팰린드롬인지 확인하는 메서드
    public static boolean isPalindrome(String str) {
        int length = str.length();
        
        // 문자열을 앞뒤로 비교하여 팰린드롬 여부 확인
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        
        return true;
    }
}
