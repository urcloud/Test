import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i=0; i<n; i++) {
            int v = scanner.nextInt();
            int e = scanner.nextInt();
            
            System.out.println(2-v+e);
        }
        
        scanner.close();
    }
}