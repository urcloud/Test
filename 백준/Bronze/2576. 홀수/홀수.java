import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int min = 99;

        for(int i=0; i<7; i++) {
            int n = scanner.nextInt();

            if(n%2==1) {
                if(min>n) {
                    min = n;
                }
                total += n;
            }
        }

        if(total==0) {
            System.out.println(-1);
        } else {
            System.out.println(total);
            System.out.println(min);
        }

        scanner.close();
    }
}