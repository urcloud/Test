import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int moveCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        hanoi(N, 1, 3, 2);
        
        System.out.println(moveCount);
        System.out.println(sb.toString());
    }

    public static void hanoi(int n, int from, int to, int aux) {
        if (n == 1) {
            moveCount++;
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }

        hanoi(n - 1, from, aux, to);
        
        moveCount++;
        sb.append(from).append(" ").append(to).append("\n");

        hanoi(n - 1, aux, to, from);
    }
}