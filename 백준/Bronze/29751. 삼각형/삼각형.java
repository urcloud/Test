import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();

        double result = 0.5*W*H;
        
        System.out.printf("%.1f",result);
        scanner.close();
    }
}