import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = (int) (0.78*N);
        int b = (int) (N-(N*0.2*0.22));
        
        System.out.println(a);
        System.out.println(b);
        
        scanner.close();
    }
}