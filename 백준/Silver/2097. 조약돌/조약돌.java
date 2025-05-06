import java.util.*;

public class Main {
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n==1 || n==2) {
            System.out.println(4);
        } else {
            int r = (int) Math.ceil(Math.sqrt(n));
            if((r*r) >= n && (r-1)*r < n) {
                System.out.println(4*(r-1));
            } else {
                System.out.println(2*(r-1)+2*(r-2));
            }
        }

        scanner.close();
    }
}