import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();

    int[] A = new int[N];
    int count = 0;

    for (int i = 1; i <= N; i++) {
      if (N % i == 0) {
        A[count] = i;
        count++;
      }
    }

    if (count < K) {
      System.out.println(0);
    } else {
      System.out.println(A[K - 1]);
    }

    scanner.close();
  }
}