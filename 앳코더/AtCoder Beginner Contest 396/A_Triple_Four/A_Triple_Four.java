import java.util.Scanner;

public class A_Triple_Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] num = new int[N];

        for(int i=0; i<N; i++) {
            num[i] = scanner.nextInt();
        }

        for(int j=0; j<(N-2); j++) {
            if(num[j] == num[j+1] && num[j] == num[j+2]) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");

        scanner.close();
    }
}