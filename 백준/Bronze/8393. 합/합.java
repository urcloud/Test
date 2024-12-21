import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int total = (int) (0.5 * n * (n + 1));

    System.out.println(total);

    scanner.close();
  }
}