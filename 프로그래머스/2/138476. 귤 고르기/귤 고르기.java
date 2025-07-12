import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int sum = 0;
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        for (int v : list) {
            if (sum + v >= k) {
                answer++;
                break;
            } else {
                sum += v;
                answer++;
            }
        }
        return answer;
    }
}