import java.util.*;

public class C_Buy_Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] black = new Integer[N];
        int M = scanner.nextInt();
        Integer[] white = new Integer[M];
        
        long blackSum = 0;
        long whiteSum = 0;
        long maxSum = 0;

        for(int i=0; i<N; i++) {
            black[i] = scanner.nextInt();
        }

        for(int j=0; j<M; j++) {
            white[j] = scanner.nextInt();
        }

        Arrays.sort(black, Collections.reverseOrder());
        Arrays.sort(white, Collections.reverseOrder());

        for (int k = 0; k < N; k++) {
            blackSum += black[k];

            if(k<M && white[k] > 0) {
                whiteSum += white[k];
            }

            maxSum = Math.max(maxSum, blackSum + whiteSum);
        }

        System.out.println(maxSum);
        scanner.close();
    }
}