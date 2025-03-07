import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int m = Integer.parseInt(br.readLine());
        
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            left.push(ch);
        }
        
        while (m-- > 0) {
            String command = br.readLine();
            char cmd = command.charAt(0);
            
            if (cmd == 'L') {
                if (!left.isEmpty()) {
                    right.push(left.pop());
                }
            } else if (cmd == 'D') {
                if (!right.isEmpty()) {
                    left.push(right.pop());
                }
            } else if (cmd == 'B') {
                if (!left.isEmpty()) {
                    left.pop();
                }
            } else if (cmd == 'P') {
                char x = command.charAt(2);
                left.push(x);
            }
        }
        
        StringBuilder result = new StringBuilder();
        while (!left.isEmpty()) {
            right.push(left.pop());
        }
        while (!right.isEmpty()) {
            result.append(right.pop());
        }
        
        System.out.println(result);
    }
}