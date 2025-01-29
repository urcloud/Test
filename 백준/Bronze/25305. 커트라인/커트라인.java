import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int k = scanner.nextInt();
        int[] score = new int[N];
        
        for (int i=0; i<N; i++) {
            score[i] = scanner.nextInt();
        }
        Arrays.sort(score);
        
        System.out.println(score[N-k]);
        scanner.close();
    }
}