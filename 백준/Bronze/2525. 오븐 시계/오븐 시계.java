import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        int totalmin = (A*60)+B+C;
        int min = totalmin%60;
        int hour = (totalmin/60)%24;
        
        System.out.println(hour);
        System.out.println(min);
        
        
        scanner.close();
    }
}