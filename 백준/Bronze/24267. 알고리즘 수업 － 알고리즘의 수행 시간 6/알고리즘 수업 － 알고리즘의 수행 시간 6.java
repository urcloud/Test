import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        
        //조합
        long result = N*(N-1)*(N-2)/6;
        
        System.out.println(result);
        System.out.println(3);
        
        scanner.close();
    }
}