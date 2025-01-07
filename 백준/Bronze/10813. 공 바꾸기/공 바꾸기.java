import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[] basket = new int[N];

    for (int i=0; i<N; i++) {
      basket[i] = (i+1);
    }

    for (int i = 0; i < M; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      int temp = basket[a - 1];
      basket[a - 1] = basket[b - 1];
      basket[b - 1] = temp;
    }

    for (int i=0; i<N; i++) {
      System.out.println(basket[i]);
    }

    scanner.close();
  }
}