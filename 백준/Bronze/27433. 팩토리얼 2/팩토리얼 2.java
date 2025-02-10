import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long result = 1;

        if(N==0) {
            System.out.println(result);
        } else {
            for(int i=1; i<=N; i++) {
                result *= i;
            }

            System.out.println(result);
        }
        scanner.close();
    }
}