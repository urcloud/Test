import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        long result = 1;
        
        for (int i=1; i<N; i+=2) {
            result = result * i % 1000000007;
        }
        
        System.out.println(result);
        scanner.close();
    }
}