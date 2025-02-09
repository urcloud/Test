import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        int a = T/5;
        int b = T%5;
        
        for(int i=0; i<a; i++) {
            System.out.print("V");
        }
        
        for(int j=0; j<b; j++) {
            System.out.print("I");
        }
        
        scanner.close();
    }
}