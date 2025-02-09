import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        float result = (float) n/4;
        
        System.out.println(result);
        scanner.close();
    }
}