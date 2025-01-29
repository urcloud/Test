import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();
        
        BigInteger result = A.multiply(B);
        
        System.out.println(result);
        
        scanner.close();
    }
}