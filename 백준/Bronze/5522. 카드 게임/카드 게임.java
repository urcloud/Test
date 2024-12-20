import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int score[] = new int[5];

    for (int i = 0; i < 5; i++) {
      score[i] = scanner.nextInt();
    }


    int total = score[0] + score[1] + score[2] + score[3] + score[4];

    System.out.println(total);
  }
}