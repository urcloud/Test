class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double tsum = 0;
        
        for(int i=0; i<arr.length; i++) {
            tsum += arr[i];
        }
        answer = tsum/arr.length;
        return answer;
    }
}