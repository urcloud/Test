import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for(int i=0; i<n; i++) {
            int num = scanner.nextInt();
            if (num%2 == 1) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
