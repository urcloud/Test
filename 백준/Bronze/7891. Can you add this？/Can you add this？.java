import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    BigInteger a[] = new BigInteger[num];
    BigInteger b[] = new BigInteger[num];

    for (int i=0; i<num; i++) {
      a[i] = scanner.nextBigInteger();
      b[i] = scanner.nextBigInteger();
    }

    for (int j=0; j<num; j++) {
      System.out.println(a[j].add(b[j]));
    }
  }
}