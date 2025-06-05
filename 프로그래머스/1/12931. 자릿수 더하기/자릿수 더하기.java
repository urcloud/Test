import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(solution(N));
    }
    
    public static int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);
        
        for(int i=0; i<s.length(); i++) {
            answer += Character.getNumericValue(s.charAt(i));
        }
        
        return answer;
    }
}