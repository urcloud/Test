import java.util.Scanner;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BigInteger total = scanner.nextBigInteger();
    BigInteger diff = scanner.nextBigInteger();

    BigInteger Klaudia = total.subtract(diff).divide(BigInteger.valueOf(2)).add(diff);
    BigInteger Natalia = total.subtract(diff).divide(BigInteger.valueOf(2));

    System.out.println(Klaudia);
    System.out.println(Natalia);
  }
}