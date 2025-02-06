import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 0;
        boolean b = true;
        
        for (int i = 0; i < 8; i++) {
            n = scanner.nextInt();
            if (n == 9) b = false;
        }
        
        if (b == true) {
            System.out.print("S");
        }
        else if (b == false) {
            System.out.print("F");
        }
        
        scanner.close();
    }
}