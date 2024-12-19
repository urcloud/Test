import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      int n = scanner.nextInt();
      int s = scanner.nextInt();
        
      if(n==0 && s==0) {
          break;
      }

      if (n > s) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}