import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S1 = scanner.nextInt();
        int S2 = scanner.nextInt();
        int num = (int) S2/2;

        if(S2%2 == 0) {
            if(S1>=num) {
                System.out.println("E");
            } else {
                System.out.println("H");
            }
        } else if (S2%2 != 0) {
            if(S1>num) {
                System.out.println("E");
            } else {
                System.out.println("H");
            }
        }

        scanner.close();
    }
}