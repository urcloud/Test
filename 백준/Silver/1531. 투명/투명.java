import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int arr[][] = new int[101][101];
        int count = 0;

        for(int i=0; i<n; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            for(int j=x1; j<=x2; j++) {
                for(int k=y1; k<=y2; k++) {
                    arr[j][k] +=1;
                }
            }
        }
        
        for(int i=1; i<=100; i++) {
            for(int j=1; j<=100; j++) {
                if(arr[i][j]>m) {
                    count++;
                }
            }
        }

        System.out.println(count);
        scanner.close();
    }
}