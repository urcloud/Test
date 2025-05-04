 import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;

        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int j=i; j<=n; j++) {
                sum +=j;
                if(sum>n)
                break;
                else if(sum==n) {
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
        scanner.close();
    }
}