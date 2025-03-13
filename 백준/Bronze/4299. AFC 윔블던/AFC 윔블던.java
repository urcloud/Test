import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int sub = scanner.nextInt();

        int a = (sum+sub)/2;
        int b = (sum-sub)/2;

        if((sum+sub)%2!=0 || sum<sub) {
            System.out.println(-1);
        } else if(a>b) {
            System.out.println(a+" "+b);
        } else {
            System.out.println(b+" "+a);
        }
		scanner.close();
    }
}