import java.util.*;

public class C_Uniqueness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> result = new HashMap<>();

        for(int i=0; i<n; i++) {
            nums[i] = scanner.nextInt();
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            result.put(nums[i], i + 1);
        }

        int maxCount = -1;
        int maxResult = -1;

        for (int num : nums) {
            if (count.get(num) == 1) {
                if (num > maxCount) {
                    maxCount = num;
                    maxResult = result.get(num);
                }
            }
        }
        System.out.println(maxResult);
        scanner.close();
    }
}