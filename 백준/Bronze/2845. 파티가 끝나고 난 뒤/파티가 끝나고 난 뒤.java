import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int S = scanner.nextInt();
        int N = scanner.nextInt();
        int M = S*N;
        int[] L = new int[5];
            
        for(int i=0; i<5; i++) {
            L[i] = scanner.nextInt();
            System.out.println(L[i]-M);
        }
        
        scanner.close();
    }
}