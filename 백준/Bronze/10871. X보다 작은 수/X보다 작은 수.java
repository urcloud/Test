import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int X = scanner.nextInt();
      
    int[] A = new int[N];
      
    for (int i=0; i<N; i++) {
        A[i] = scanner.nextInt();
    }
      
    for (int j=0; j<N; j++) {
        if(A[j] < X) {
            System.out.println(A[j]);
        }
    }
      
    scanner.close();
  }
}