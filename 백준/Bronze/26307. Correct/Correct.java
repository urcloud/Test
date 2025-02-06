import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        
        int result = (H-9)*60 + M;
        
        System.out.println(result);
        
        scanner.close();
    }
}