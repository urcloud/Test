import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = x%7;
        
        if(n==2){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        scanner.close();
    }
}