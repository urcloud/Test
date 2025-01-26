import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int K = scanner.nextInt();
        
        int[] cowR = new int[N];
        for(int i=0; i<N; i++) {
            cowR[i] = scanner.nextInt();
        }
        
        Arrays.sort(cowR);
        
        int result = 0;
        
        for (int i=0; i<N; i++) {
            if(cowR[i] <= L) {
                result++;
                L+=K;
            } else {
                break;
            }
        }
        
        System.out.println(result);
        scanner.close();
    }
}