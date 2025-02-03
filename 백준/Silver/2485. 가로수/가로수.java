import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] T = new int[N];
        
        for(int i=0; i<N; i++) {
            T[i] = scanner.nextInt();
        }
        
        int gcd = T[1] - T[0];
        for (int i = 2; i < N; i++) {
            gcd = gcd(gcd, T[i] - T[i - 1]);
        }
        
        int aT = 0;
        for (int i = 1; i < N; i++) {
            int dis = T[i] - T[i-1];
            aT += (dis/gcd) - 1;
        }
        
        System.out.println(aT);
        scanner.close();
    }
    
    
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}