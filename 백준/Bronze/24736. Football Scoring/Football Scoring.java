import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        
        for (int i=0; i<5; i++) {
            A[i] = scanner.nextInt();
        }
        
        for (int i=0; i<5; i++) {
            B[i] = scanner.nextInt();
        }
        
        int T1 = A[0]*6 + A[1]*3 + A[2]*2 + A[3]*1 + A[4]*2;
        int T2 = B[0]*6 + B[1]*3 + B[2]*2 + B[3]*1 + B[4]*2;

        System.out.println(T1);
        System.out.println(T2);
        
        scanner.close();
    }
}