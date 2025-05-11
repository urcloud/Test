import java.util.Scanner;

public class C_Sum_of_Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];
        long totalSum = 0;

        for(int i=0; i<n; i++) {
            num[i] = scanner.nextInt();
            totalSum += num[i];
        }

        long result = 0;

        for (int i = 0; i < n; i++) {
            totalSum -= num[i];
            result += num[i] * totalSum;
        }

        System.out.println(result);
        scanner.close();
    }
}