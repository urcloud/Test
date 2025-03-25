import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int result = 0;

        for(int i=0; i<n; i++) {
            a = (a%b)*10;
            result = a/b;
        }
        
        System.out.println(result);
        scanner.close();
    }
}