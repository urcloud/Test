import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    for (int i=0; i<N; i++) {
      int C = scanner.nextInt();
      int Q = C/25;
      int D = (C%25)/10;
      int N2 = ((C%25)%10)/5;
      int P = (((C%25)%10)%5);
      System.out.println(Q);
      System.out.println(D);
      System.out.println(N2);
      System.out.println(P);
    }
  }
}