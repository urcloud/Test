import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // N 입력
        int X = scanner.nextInt(); // X 입력
        
        ArrayList<Integer> A = new ArrayList<>(); // 수열 A를 저장할 ArrayList 생성
        
        // 수열 A를 입력받아 ArrayList에 저장
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            A.add(num);
        }
        
        // X보다 작은 수를 출력
        for (int num : A) {
            if (num < X) {
                System.out.print(num + " ");
            }
        }
        
        scanner.close();
    }
}
