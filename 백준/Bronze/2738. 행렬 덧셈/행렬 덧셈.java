import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();
    
    int[][] matrix1 = new int [n][m];
    int[][] matrix2 = new int [n][m];
    int[][] matrix3 = new int [n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix1[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix2[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
        System.out.println(matrix3[i][j]);
      }
    }
  }
}