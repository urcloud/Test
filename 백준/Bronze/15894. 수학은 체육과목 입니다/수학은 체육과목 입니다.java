import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long n = scanner.nextLong();
        
        System.out.println(n*3 + n);
        
        scanner.close();
    }
}