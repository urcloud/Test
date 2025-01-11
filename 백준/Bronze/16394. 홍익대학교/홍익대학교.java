import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int y = scanner.nextInt();
        int z = (y-1946);
        
        System.out.println(z);
        
        scanner.close();
    }
}