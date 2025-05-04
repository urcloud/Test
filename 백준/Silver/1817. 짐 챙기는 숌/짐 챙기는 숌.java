import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] books = new int[n];
        int box = 1;
        int sum = 0;

        if(n==0) {
            System.out.println(0);
        } else {

            for(int i=0; i<n; i++) {
                books[i] = scanner.nextInt();
            }

            for(int x : books) {
                sum += x;
                if(sum>m) {
                    box++;
                    sum = x;
                }
            }

            System.out.println(box);
            scanner.close();
        }
    }
}