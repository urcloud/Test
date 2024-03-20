import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int count = 0;
        while (N % 5 != 0 && N >= 0) {
            N -= 3;
            count++;
        }

        if (N < 0) {
            System.out.println("-1"); // 정확하게 N킬로그램을 만들 수 없는 경우
        } else {
            count += N / 5;
            System.out.println(count);
        }
    }
}
