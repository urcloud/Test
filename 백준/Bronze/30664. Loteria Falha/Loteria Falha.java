import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();

        while(n.compareTo(BigInteger.valueOf(0)) != 0) {
            if(n.remainder(BigInteger.valueOf(42)).compareTo(BigInteger.valueOf(0)) == 0) {
                System.out.println("PREMIADO");
            }else {
                System.out.println("TENTE NOVAMENTE");
            }
            n = scanner.nextBigInteger();
        }
        scanner.close();
    }
}