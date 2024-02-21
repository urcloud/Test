import java.util.Scanner;

public class Main {
    // 분해합을 계산하는 메소드
    public static int decompositionSum(int num) {
        int sum = num; // 자기 자신을 더해줌
        while (num != 0) {
            sum += num % 10; // 각 자리수를 더함
            num /= 10; // 다음 자리수로 이동
        }
        return sum;
    }

    // 생성자를 찾는 메소드
    public static int findConstructor(int N) {
        for (int i = 1; i < N; i++) {
            if (decompositionSum(i) == N) {
                return i; // 생성자를 찾으면 해당 숫자를 반환
            }
        }
        return 0; // 생성자를 찾지 못한 경우 0을 반환
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 입력 받기
        scanner.close();

        int result = findConstructor(N); // 생성자를 찾기

        System.out.println(result); // 결과 출력
    }
}
