import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int layer = 1; // 층 수 초기화
        int range = 1; // 범위 초기화
        int count = 1; // 방 번호 초기화

        // 입력된 번호가 범위 내에 존재할 때까지 반복
        while (range < N) {
            range += 6 * layer; // 다음 층으로 범위 증가
            layer++; // 층 수 증가
            count++; // 방 번호 증가
        }

        System.out.println(count); // 최소 개수의 방 출력
    }
}
