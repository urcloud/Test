import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] num = new int[N];
        int sum = 0;

        for (int i=0; i<N; i++) {
            num[i] = scanner.nextInt();
            sum += num[i];
        }

        int result1 = (int) Math.round((double) sum / N);
        
        Arrays.sort(num);
        int result2 = num[N/2];

        Map<Integer, Integer> map = new HashMap<>();
        for(int n : num) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer> modes = new ArrayList<>(map.keySet());
        modes.sort((a, b) -> {
            int compare = map.get(b) - map.get(a);
            if(compare == 0) {
                return a - b;
            }
            return compare;
        });

        int result3;
        if(modes.size() == 1) {
            result3 = modes.get(0);
        } else {
            if(map.get(modes.get(0)).equals(map.get(modes.get(1)))) {
                result3 = modes.get(1);
            } else {
                result3 = modes.get(0);
            }
        }

        int result4 = num[N-1] - num[0];

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}