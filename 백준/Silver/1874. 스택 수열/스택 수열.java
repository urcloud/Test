import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        int num = 1;
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int target = scanner.nextInt();

            while (num <= target) { // target까지 push
                stack.push(num++);
                result.append("+\n");
            }

            if (stack.peek() == target) { // target이 스택의 top이면 pop
                stack.pop();
                result.append("-\n");
            } else {
                possible = false;
                break;
            }
        }

        if (possible) {
            System.out.print(result);
        } else {
            System.out.println("NO");
        }
    }
}
