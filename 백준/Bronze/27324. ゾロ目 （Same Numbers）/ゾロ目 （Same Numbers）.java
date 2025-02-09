import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = N/10;
        int b = N%10;
        
        if(a==b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        scanner.close();
    }
}