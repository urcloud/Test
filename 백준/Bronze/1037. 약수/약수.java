import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] num = new int[N];

        for(int i=0; i<N; i++) {
            num[i] = scanner.nextInt();
        }

        Arrays.sort(num);

        System.out.println(num[0]*num[N-1]);
        scanner.close();
    }
}