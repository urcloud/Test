import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        Arrays.sort(num);
        int x = scanner.nextInt();

        int left = 0;
        int right = n - 1;
        int count = 0;

        while (left < right) {
            int sum = num[left] + num[right];

            if (sum == x) {
                count++;
                left++;
                right--;
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(count);
    }
}
