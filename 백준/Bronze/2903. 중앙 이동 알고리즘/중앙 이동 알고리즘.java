import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int R = (int) (Math.pow(2, N) + 1);
    int V = (int) Math.pow(R, 2);

    System.out.println(V);
  }
}