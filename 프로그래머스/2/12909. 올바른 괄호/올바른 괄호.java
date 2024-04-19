import java.util.*;

class Solution {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false; // ')'가 더 많은 경우
                } else {
                    stack.pop();
                }
            }
        }
        
        return stack.isEmpty(); // 스택이 비어있으면 올바른 괄호
    }
}
