import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //(n-1)(n)/2
        long N = scanner.nextLong();
        long result = (N * (N-1))/2;
        
        //O(n^2)
        System.out.println(result);
        System.out.println(2);
        
        scanner.close();
    }
}