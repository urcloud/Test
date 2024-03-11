import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // 전체 사람의 수 N 입력
        
        int[] weight = new int[N]; // 몸무게 배열
        int[] height = new int[N]; // 키 배열
        int[] rank = new int[N]; // 덩치 등수 배열
        
        // 각 사람의 몸무게와 키 입력
        for (int i = 0; i < N; i++) {
            weight[i] = scanner.nextInt();
            height[i] = scanner.nextInt();
            rank[i] = 1; // 초기 덩치 등수는 1로 설정
        }
        
        // 덩치 등수 계산
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) continue; // 같은 사람은 비교하지 않음
                if (weight[i] < weight[j] && height[i] < height[j]) {
                    rank[i]++; // 덩치가 큰 사람이 있으면 등수 증가
                }
            }
        }
        
        // 덩치 등수 출력
        for (int i = 0; i < N; i++) {
            System.out.print(rank[i] + " ");
        }
        
        scanner.close();
    }
}
