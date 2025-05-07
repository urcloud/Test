import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] num = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                num[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();

        for(int i=0; i<k; i++) {
            int result = 0;
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            int c = scanner.nextInt() - 1;
            int d = scanner.nextInt() - 1;
        
            for(int p=a; p<=c; p++) {
                for(int q=b; q<=d; q++) {
                    result += num[p][q];
                }
            }
            System.out.println(result);
        }

        scanner.close();
    }
}