import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for(int i=0; i<N; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            
            System.out.println(lcm(A, B));
        }
        
        scanner.close();
    }
    
    private static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    private static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}