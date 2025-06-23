import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s, " ");
        int n = st.countTokens();
        int[] num = new int[n];
        
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(num);
        
        answer = Integer.toString(num[0])+" "+Integer.toString(num[n-1]);
        
        return answer;
    }
}