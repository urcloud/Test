import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] screen = new int[N];
        int[] basket = new int[M];
        int j = scanner.nextInt();
        
        int left=0;
        int right=left+M-1;
        int dist=0;
        
        for(int i=0; i<j; i++) {
            int apple=scanner.nextInt()-1;
            if(apple<left) {
                int diff=left-apple;
                dist+=diff;
                left-=diff;
                right-=diff;
            } else if (apple>right) {
                int diff=apple-right;
                dist+=diff;
                right+=diff;
                left+=diff;
            }
        }
        System.out.println(dist);
        scanner.close();
    }
}