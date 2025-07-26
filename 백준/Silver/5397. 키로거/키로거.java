import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder output = new StringBuilder();

        for (int t = 0; t < T; t++) {
            String input = br.readLine();

            Deque<Character> left = new ArrayDeque<>();
            Deque<Character> right = new ArrayDeque<>();

            for (char ch : input.toCharArray()) {
                if (ch == '-') {
                    if (!left.isEmpty()) left.pollLast();
                } else if (ch == '<') {
                    if (!left.isEmpty()) right.addFirst(left.pollLast());
                } else if (ch == '>') {
                    if (!right.isEmpty()) left.addLast(right.pollFirst());
                } else {
                    left.addLast(ch);
                }
            }

            for (char c : left) output.append(c);
            for (char c : right) output.append(c);
            output.append('\n');
        }

        System.out.print(output);
    }
}
