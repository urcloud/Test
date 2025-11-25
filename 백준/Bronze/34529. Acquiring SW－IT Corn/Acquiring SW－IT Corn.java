import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int u = scanner.nextInt();
        int v = scanner.nextInt();
        int w = scanner.nextInt();

        int cost = (u/100)*x + (v/50)*y + (w/20)*z;
        System.out.println(cost);
        scanner.close();
    }
}