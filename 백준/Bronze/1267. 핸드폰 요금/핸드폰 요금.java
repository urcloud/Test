import java.util.Scanner;
 
public class Main {
 
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int time = 0;
        int Y = 0;
        int M = 0;

        for (int i = 0; i < n; i++) {
            time = scanner.nextInt();
            Y += ((time / 30) + 1) * 10;
            M += ((time / 60) + 1) * 15;
 
        }
        
        if (Y == M) {
            System.out.println("Y M " + Y);
        } else if (Y < M) {
            System.out.println("Y " + Y);
        } else if (Y > M) {
            System.out.println("M " + M);
        }

        scanner.close();
    }
}
