import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        
        long result = A*B;
        
        System.out.println(result);
        
        scanner.close();
    }
}