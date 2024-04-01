import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 숫자의 개수 입력
        int N = scanner.nextInt();

        // 숫자들을 공백 없이 입력받아 합 계산
        String numbers = scanner.next();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            // 각 숫자를 문자열로부터 정수로 변환하여 합에 더함
            sum += Character.getNumericValue(numbers.charAt(i));
        }

        // 합 출력
        System.out.println(sum);
    }
}
