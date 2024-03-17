import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거
        
        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = row.charAt(j);
            }
        }
        
        int minChanges = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                minChanges = Math.min(minChanges, countChanges(board, i, j));
            }
        }
        
        System.out.println(minChanges);
    }
    
    private static int countChanges(char[][] board, int startX, int startY) {
        int count1 = 0; // 첫 번째 칸이 W로 시작하는 경우
        int count2 = 0; // 첫 번째 칸이 B로 시작하는 경우
        
        char[] pattern1 = {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};
        char[] pattern2 = {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};
        
        for (int i = startX; i < startX + 8; i++) {
            for (int j = startY; j < startY + 8; j++) {
                if ((i - startX + j - startY) % 2 == 0) { // 짝수번째 칸
                    if (board[i][j] != 'W') {
                        count1++;
                    }
                    if (board[i][j] != 'B') {
                        count2++;
                    }
                } else { // 홀수번째 칸
                    if (board[i][j] != 'B') {
                        count1++;
                    }
                    if (board[i][j] != 'W') {
                        count2++;
                    }
                }
            }
        }
        
        return Math.min(count1, count2);
    }
}
