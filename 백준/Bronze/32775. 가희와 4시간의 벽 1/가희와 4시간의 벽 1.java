import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sab = scanner.nextInt();
        int fab = scanner.nextInt();

        if (sab>fab) {
            System.out.println("flight");
        } else {
            System.out.println("high speed rail");
        }

        scanner.close();
    }
}