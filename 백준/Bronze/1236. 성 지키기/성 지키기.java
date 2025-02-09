import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();	// 세로
        int M = scanner.nextInt();	// 가로
        int row = 0;	// 행
        int col = 0;	// 열
        char[][] castle = new char[N][M];
        
        for(int i=0; i< castle.length; i++) {
            String str = scanner.next();
            for(int j=0; j< castle[i].length; j++) {
                castle[i][j] = str.charAt(j);
            }
        }

        // 행 경비 수
        for(int i=0; i<N; i++) {
            boolean flag = true;
            for(int j=0; j<M; j++) {
                if(castle[i][j] == 'X') {
                    flag = false;
                    break;
                }
            }
            if(flag)
                row ++;
        }

        // 열 경비 수
        for(int i=0; i<M; i++) {
            boolean flag = true;
            for(int j=0; j<N; j++) {
                if(castle[j][i] == 'X') {
                    flag = false;
                    break;
                }
            }
            if(flag)
                col ++;
        }

        System.out.println(Math.max(row, col));
        scanner.close();
    }
}