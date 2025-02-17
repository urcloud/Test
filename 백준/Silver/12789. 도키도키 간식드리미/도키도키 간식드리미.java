import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < N; i++) {
            queue.add(scanner.nextInt());
        }
        
        int expected = 1;
        while (!queue.isEmpty() || !stack.isEmpty()) {
            if (!queue.isEmpty() && queue.peek() == expected) {
                queue.poll();
                expected++;
            } else if (!stack.isEmpty() && stack.peek() == expected) {
                stack.pop();
                expected++;
            } else if (!queue.isEmpty()) {
                stack.push(queue.poll());
            } else {
                break;
            }
        }
        
        System.out.println(expected > N ? "Nice" : "Sad");
    }
}
