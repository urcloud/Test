import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        if (N==0) {
            System.out.println("YONSEI");
        } else if(N==1) {
            System.out.println("Leading the Way to the Future");
        }
        
        scanner.close();
    }
}