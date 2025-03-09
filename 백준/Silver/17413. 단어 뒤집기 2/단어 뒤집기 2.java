import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean flag = false;
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '<') {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                flag = true;
            } else if (str.charAt(i) == '>') {
                flag = false;
                sb.append(str.charAt(i));
                continue;
            }

            if(flag == true) {
                sb.append(str.charAt(i));
            } else if (flag == false) {
                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
            } else {
                stack.push(str.charAt(i));
            }
        }

        if (i == str.length() - 1) {
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
        }
    }

    System.out.println(sb);
    scanner.close();
    }
}