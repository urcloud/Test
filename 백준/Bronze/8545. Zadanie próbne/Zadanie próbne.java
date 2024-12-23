import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    StringBuffer N = new StringBuffer(scanner.nextLine());
    String P = N.reverse().toString();

    System.out.println(P);

  }
}