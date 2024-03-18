import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] A = new int[N];
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            set.add(A[i]); // HashSet에 배열 A의 모든 요소 추가
        }
        
        int M = scanner.nextInt();
        for (int i = 0; i < M; i++) {
            int num = scanner.nextInt();
            if (set.contains(num)) {
                System.out.println("1"); // 존재하는 경우
            } else {
                System.out.println("0"); // 존재하지 않는 경우
            }
        }
    }
}
