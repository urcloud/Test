import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int n = (int) (a/4);

    for (int i = 0; i<n; i++) {
      System.out.print("long ");
    }


    System.out.print("int");
  }
}