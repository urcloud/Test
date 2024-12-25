import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n1 = scanner.nextInt();
        int k1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int k2 = scanner.nextInt();
        
        int sum = n1*k1 + n2*k2;
        
        System.out.println(sum);
        
        scanner.close();
    }
}