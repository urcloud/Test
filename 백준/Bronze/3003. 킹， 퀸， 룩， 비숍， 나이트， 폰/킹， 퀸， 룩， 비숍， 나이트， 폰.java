import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int result[] = {1, 1, 2, 2, 2, 8};
    int chess[] = new int[6];

    for (int i = 0; i < chess.length; i++) {
      chess[i] = scanner.nextInt();
    }

    int abs[] = new int[6];
    for (int j = 0; j < result.length; j++) {
      abs[j] = result[j] - chess[j];
      System.out.print(abs[j] + " ");
    }

    scanner.close();
  }
}