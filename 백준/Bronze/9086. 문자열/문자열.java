import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();

    for (int i = 0; i < N; i++) {
      String S = scanner.next();
      System.out.print(S.charAt(0));
      System.out.println(S.charAt(S.length() - 1));
    }
    
    scanner.close();
  }
}