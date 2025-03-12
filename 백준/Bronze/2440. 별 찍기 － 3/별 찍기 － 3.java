import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=N; i>0; i--) {
            String str = "*";
            System.out.println(str.repeat(i));
        }

        scanner.close();
    }
}