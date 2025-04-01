import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int t = 0; t < 3; t++) {
            int N = scanner.nextInt();
            BigInteger sum = BigInteger.ZERO;

            for (int i = 0; i < N; i++) {
                sum = sum.add(scanner.nextBigInteger());
            }

            if (sum.compareTo(BigInteger.ZERO) > 0) {
                System.out.println("+");
            } else if (sum.compareTo(BigInteger.ZERO) < 0) {
                System.out.println("-");
            } else {
                System.out.println("0");
            }
        }
        scanner.close();
    }
}