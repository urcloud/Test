import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();

    int C = A * (B%10);
    int D = A * ((B%100)/10);
    int E = A * (B/100);
    int F = C + (10*D) + (100*E);

    System.out.println(C);
    System.out.println(D);
    System.out.println(E);
    System.out.println(F);

    scanner.close();
  }
}