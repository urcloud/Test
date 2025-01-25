import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n12 = scanner.nextInt();
        
        int N = ((n1+1)*(n2+1)/(n12+1))-1;
        
        scanner.close();
        
        System.out.println(N);
    }
}