import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();

    for (int i = 1; i < N+1; i++) {
      System.out.println(i);
    }

    scanner.close();

  }
}