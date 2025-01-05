import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int R = scanner.nextInt();
    int C = scanner.nextInt();

    for (int i =0; i<R; i++) {
      System.out.println("*".repeat(C));
    }

    scanner.close();
  }
}