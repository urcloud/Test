import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int weight[] = new int[3];

    for (int i = 0; i < 3; i++) {
      weight[i] = scanner.nextInt();
    }
    
    Arrays.sort(weight);
    System.out.println(weight[1]);
  }
}