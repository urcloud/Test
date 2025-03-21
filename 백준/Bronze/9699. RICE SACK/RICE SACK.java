import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        for (int i=0; i<n; i++) {
            int max = 0;
            for (int j=0; j<5; j++) {
                int num = scanner.nextInt();
                if (max<num) max = num;
            }
            
            System.out.println("Case #" + (i+1) + ": " + max);
        }
    }
}