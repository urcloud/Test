import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int A = (int) (B/11*10);
        System.out.println(A);
        scanner.close();
    }
}