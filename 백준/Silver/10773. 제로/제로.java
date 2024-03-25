import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                stack.pop(); // 가장 최근에 쓴 수를 지움
            } else {
                stack.push(num); // 수를 스택에 적음
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop(); // 스택에 남아있는 수의 합을 계산
        }

        System.out.println(sum);
    }
}
