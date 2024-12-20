import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while(true) {
      int n = scanner.nextInt();
      if (n==0) {
        break;
      }
      int sum = (int) ((0.5) * (n + 1) * n);
      System.out.println(sum);
    }
  }
}