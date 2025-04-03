import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int original = N;
        int count = 0;
        
        do {
            int tens = N / 10;
            int ones = N % 10;
            int sum = tens + ones;
            N = (ones * 10) + (sum % 10);
            count++;
        } while (N != original);
        
        System.out.println(count);
        scanner.close();
    }
}