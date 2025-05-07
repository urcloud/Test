import java.util.Stack;

public class D_Colorful_Bracket_Sequence {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            
            if (c == '(' || c == '[' || c == '<') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    System.out.println("No");
                    return;
                }
                
                boolean flag = false;
                if (c == ')' && st.peek() != '(') flag = true;
                if (c == ']' && st.peek() != '[') flag = true;
                if (c == '>' && st.peek() != '<') flag = true;
                
                if (flag) {
                    System.out.println("No");
                    return;
                }
                
                st.pop();
            }
        }
        
        if (st.isEmpty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
