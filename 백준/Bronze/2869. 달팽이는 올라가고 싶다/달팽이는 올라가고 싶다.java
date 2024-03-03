import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); // 낮에 올라가는 거리
        int B = scanner.nextInt(); // 밤에 미끄러지는 거리
        int V = scanner.nextInt(); // 나무의 높이

        int days = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) {
            days++;
        }

        System.out.println(days);
    }
}
