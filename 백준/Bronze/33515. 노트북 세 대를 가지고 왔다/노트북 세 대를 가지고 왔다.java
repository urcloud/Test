import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();

        if(t1<=t2) {
            System.out.println(t1);
        } else {
            System.out.println(t2);
        }
        
        scanner.close();
    }
}
