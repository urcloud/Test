import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] x = new int[3];
    int[] y = new int[3];

    for(int i=0; i<3; i++) {
      x[i] = scanner.nextInt();
      y[i] = scanner.nextInt();
    }

    int x4 = 0;
    int y4 = 0;

    if(x[0] == x[1]) {
      x4 = x[2];
    } else if (x[0] == x[2]){
      x4 = x[1];
    } else {
      x4 = x[0];
    }

    if(y[0] == y[1]) {
      y4 = y[2];
    } else if (y[0] == y[2]){
      y4 = y[1];
    } else {
      y4 = y[0];
    }

    System.out.println(x4);
    System.out.println(y4);
    scanner.close();
  }
}
