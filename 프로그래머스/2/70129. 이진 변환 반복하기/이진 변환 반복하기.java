class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        
        while (!s.equals("1")) {				
            int before = s.length();
            s = s.replaceAll("0", "");
            int after = s.length();
            
            answer[1] += before - after;
            
            s = Integer.toBinaryString(after);
                
            answer[0]++;
        }
        
        return answer;
    }
}