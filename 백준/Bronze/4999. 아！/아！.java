import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //문자열 길이 비교하면 됨
    String n = scanner.nextLine();
    String m = scanner.nextLine();

    if (n.length() >= m.length()) {
      System.out.println("go");
    } else {
      System.out.println("no");
    }

    scanner.close();
  }
}