import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        int N = (int)f;

        System.out.println(N);
        scanner.close();
    }
}