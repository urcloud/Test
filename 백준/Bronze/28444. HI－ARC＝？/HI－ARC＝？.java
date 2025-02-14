import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int H = scanner.nextInt();
        int I = scanner.nextInt();
        int A = scanner.nextInt();
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        
        int result = (H*I) - (A*R*C);
        
        System.out.println(result);
        scanner.close();
    }
}