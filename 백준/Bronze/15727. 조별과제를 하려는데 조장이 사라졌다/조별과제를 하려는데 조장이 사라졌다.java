import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long N = scanner.nextLong();
        long P = (N/5);
        long S = (N%5);
        
        if(S==0) {
            System.out.println(P);
        } else if (S!=0) {
            System.out.println(P+1);
        }
        
        scanner.close();
    }
}