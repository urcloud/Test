import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        if(N<=B) {
            if(B < A) {
                System.out.println("Subway");
            } else if (B==A) {
                System.out.println("Anything");
            } else {
                System.out.println("Bus");
            }
        } else {
            System.out.println("Bus");
        }
        
        scanner.close();
    }
}