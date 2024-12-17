import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    BigInteger N = scanner.nextBigInteger();
    BigInteger M = scanner.nextBigInteger();

    BigInteger abs = N.subtract(M);
    BigInteger abs2 = abs.abs();

    System.out.println(abs2);

    scanner.close();

  }
}