import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int X = scanner.nextInt();

    for (int i=1; i<=X; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = a+b;

      System.out.println("Case #" + i + ": " + a + " + " + b + " = " + c);
    }

    scanner.close();
  }
}