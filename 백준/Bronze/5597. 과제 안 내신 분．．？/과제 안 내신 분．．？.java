import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] num = new int[30];

    for(int i=0; i<28; i++) {
      int N = scanner.nextInt();
      num[(N-1)] = 1;
    }

    for(int j=0; j<num.length; j++) {
      if(num[j] !=1) {
        System.out.println(j+1);
      }
    }
    scanner.close();
  }
}