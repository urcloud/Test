import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String ID = scanner.nextLine();
      
    String surprise = ID + "??!";
      
    System.out.println(surprise);
      
    scanner.close();
  }
}