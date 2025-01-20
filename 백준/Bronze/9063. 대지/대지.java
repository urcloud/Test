import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        
        for (int i=0; i<N; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        
        Arrays.sort(x);
        Arrays.sort(y);
        
        System.out.println((x[N-1] - x[0])*(y[N-1] - y[0]));
        scanner.close();
    }
}