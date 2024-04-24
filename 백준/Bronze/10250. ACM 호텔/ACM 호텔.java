import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int H = scanner.nextInt(); // 호텔의 층 수
            int W = scanner.nextInt(); // 각 층의 방 수
            int N = scanner.nextInt(); // 몇 번째 손님인지

            int floor = N % H; // 손님이 몇 층에 있는지 계산
            int roomNum = N / H + 1; // 손님이 해당 층에서 몇 번째 방에 있는지 계산

            if (floor == 0) { // 만약 나머지가 0이라면 층은 H층이고 방 번호는 H로 설정
                floor = H;
                roomNum -= 1;
            }

            System.out.println(floor * 100 + roomNum); // 방 번호 출력
        }
    }
}
