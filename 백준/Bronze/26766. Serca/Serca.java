import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i=0; i<n; i++) {
            System.out.println(" @@@   @@@ ");
            System.out.println("@   @ @   @");
            System.out.println("@    @    @");
            System.out.println("@         @");
            System.out.println(" @       @ ");
            System.out.println("  @     @  ");
            System.out.println("   @   @   ");
            System.out.println("    @ @    ");
            System.out.println("     @     ");
        }
        
        scanner.close();
    }
}