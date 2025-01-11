import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = (A+B) * (A-B);
        
        System.out.println(C);
        
        scanner.close();
    }
}