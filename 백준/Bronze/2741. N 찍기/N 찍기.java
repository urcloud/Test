import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 자연수 N 입력
        int N = scanner.nextInt();

        // 1부터 N까지 출력
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}
