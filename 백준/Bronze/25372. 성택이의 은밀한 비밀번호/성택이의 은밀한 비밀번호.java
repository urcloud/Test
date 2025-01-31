import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        
        for(int i=0; i<N; i++) {
            String pw = scanner.nextLine();
            
        if(pw.length()>=6 && pw.length()<=9) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        }
        
        scanner.close();
    }
}