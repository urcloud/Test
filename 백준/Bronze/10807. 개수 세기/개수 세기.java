import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] X = new int[N];
    int sum = 0;

    for (int i=0; i<N ; i++) {
      X[i] = scanner.nextInt();
    }

    int V = scanner.nextInt();

    for (int j =0; j <N ; j++) {
      if (X[j] == V) {
        sum += 1;
      }
    }

    System.out.println(sum);
    scanner.close();
  }
}