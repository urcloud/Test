import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] num = new int[n];
        int[] num2 = new int[m];

        for(int i=0; i<n; i++) {
            num[i] = i+1;
        }

        if(n==m) {
            System.out.println("*");
        } else {
            for(int j=0; j<m; j++) {
                num2[j] = scanner.nextInt();
            }

            for(int k=0; k<n; k++) {
                for(int l=0; l<m; l++) {
                    if(num[k] == num2[l]) {
                        num[k] = 0;
                    }
                }
            }

            Arrays.sort(num);

            for(int o=0; o<n; o++) {
                if(num[o] != 0) {
                    System.out.print(num[o] + " ");
                }
            }
        }

        scanner.close();
    }
}