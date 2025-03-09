import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n%3 == 1) {
            System.out.println("U");
        } else if(n%3 == 2) {
            System.out.println("O");
        } else {
            System.out.println("S");
        }
        
        scanner.close();
    }
}
