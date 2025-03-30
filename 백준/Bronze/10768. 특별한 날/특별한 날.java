import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        if(m==1) {
            System.out.println("Before");
        } else if(m==2) {
            if(d<18) {
                System.out.println("Before");
            } else if(d==18) {
                System.out.println("Special");
            } else {
                System.out.println("After");
            }
        } else {
            System.out.println("After");
        }
		
		scanner.close();
    }
}