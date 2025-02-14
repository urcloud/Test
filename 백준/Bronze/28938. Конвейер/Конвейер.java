import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int result = 0;
        
        for(int i=0; i<N; i++) {
            int a = scanner.nextInt();
            result += a;
        }
        
        if(result<0) {
            System.out.println("Left");
        } else if(result==0) {
            System.out.println("Stay");
        } else {
            System.out.println("Right");
        }
        
        scanner.close();
    }
}