import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 데이터의 수

        for (int i = 0; i < T; i++) {
            String str = scanner.next(); // 괄호 문자열 입력
            System.out.println(isValidPS(str) ? "YES" : "NO");
        }

        scanner.close();
    }

    // 올바른 괄호 문자열(VPS)인지를 판단하는 함수
    public static boolean isValidPS(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // 스택이 비어있으면 VPS, 아니면 VPS가 아님
    }
}
