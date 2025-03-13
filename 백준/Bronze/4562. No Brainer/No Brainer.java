import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=0; i<N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if(a<b) {
                System.out.println("NO BRAINS");
            } else {
                System.out.println("MMM BRAINS");
            }
        }
		scanner.close();
    }
}