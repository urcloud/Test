import java.util.*;

public class B_Card_Pile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        int cmd = 0;
        int num = 0;

        for(int i=0; i<N; i++) {
            cmd = scanner.nextInt();

            if(cmd == 2) {
                if(stack.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(stack.pop());
                }
            } else if(cmd == 1) {
                num = scanner.nextInt();
                stack.push(num);
            }
        }

        scanner.close();
    }
}