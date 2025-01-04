import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String N = scanner.nextLine();
    String P = N.toUpperCase();

    System.out.println(P);
    scanner.close();
  }
}