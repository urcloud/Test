import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n+2];
        num[0] = 0;
        num[1] = 1;

        for(int i=2; i<n+1; i++) {
            num[i] = num[i-1] + num[i-2];
        }

        System.out.println(num[n]);
        scanner.close();
    }
}