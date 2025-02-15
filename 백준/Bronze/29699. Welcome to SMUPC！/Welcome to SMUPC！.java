import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "WelcomeToSMUPC";
        int N = scanner.nextInt();
        int S = (N%14);
        
        if(S!=0) {
            System.out.println(str.charAt(S-1));
        } else if(S==0) {
            System.out.println("C");
        }
        
        scanner.close();
    }
}