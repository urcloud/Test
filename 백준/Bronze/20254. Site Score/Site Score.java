import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int Ur = scanner.nextInt();
        int Tr = scanner.nextInt();
        int Uq = scanner.nextInt();
        int Tq = scanner.nextInt();
        
        int result = 56*Ur + 24*Tr + 14*Uq + 6*Tq;
        
        System.out.println(result);
        
        scanner.close();
    }
}