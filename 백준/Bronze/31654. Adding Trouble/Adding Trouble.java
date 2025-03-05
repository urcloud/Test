import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        if(A+B==C) {
            System.out.println("correct!");
        } else {
            System.out.println("wrong!");
        }
        
        scanner.close();
    }
}