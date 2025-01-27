import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        
        //O(n^2)
        System.out.println(N*N);
        System.out.println(2);
        scanner.close();
    }
}