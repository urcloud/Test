import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        //제곱합 수학공식 사용
        int result1 = (int) ((1+N)*N*0.5);
        int result2 = result1 * result1;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result2);

        scanner.close();
    }
}