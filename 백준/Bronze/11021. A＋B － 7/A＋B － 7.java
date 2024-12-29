import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        for (int i=1; i<=T; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            System.out.println("Case #" + i + ": " + (x+y));
        }
        
        scanner.close();
    }
}