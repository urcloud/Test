import static java.lang.Math.pow;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();
    int e = scanner.nextInt();

    int sum = (int) (pow(a,2) + pow(b,2) + pow(c,2) + pow(d,2) + pow(e,2));
    int su = sum % 10;

    System.out.println(su);

    scanner.close();

  }
}