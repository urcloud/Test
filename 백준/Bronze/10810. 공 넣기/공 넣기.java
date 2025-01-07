import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // N: 바구니의 수, M: 공을 넣는 횟수
    int N = scanner.nextInt();
    int M = scanner.nextInt();

    // 바구니 상태를 저장하는 배열 (1번부터 N번까지 저장)
    int[] basket = new int[N];

    // M번의 공 넣기 작업 수행
    for (int i = 0; i < M; i++) {
      int first = scanner.nextInt();
      int second = scanner.nextInt();
      int ball = scanner.nextInt();

      // first번부터 second번까지 바구니에 ball 번호의 공을 넣음
      for (int j = first - 1; j <= second - 1; j++) {
        basket[j] = ball;
      }
    }

    // 결과 출력
    for (int i = 0; i < N; i++) {
      System.out.println(basket[i]);
    }

    scanner.close();
  }
}