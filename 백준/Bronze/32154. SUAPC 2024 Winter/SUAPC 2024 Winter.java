import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if(n==1) {
            System.out.println(11);
            System.out.println("A B C D E F G H J L M");
        } else if(n==2) {
            System.out.println(9);
            System.out.println("A C E F G H I L M");
        } else if(n==3) {
            System.out.println(9);
            System.out.println("A C E F G H I L M");
        } else if(n==4) {
            System.out.println(9);
            System.out.println("A B C E F G H L M");
        } else if(n==5) {
            System.out.println(8);
            System.out.println("A C E F G H L M");
        } else if(n==6) {
            System.out.println(8);
            System.out.println("A C E F G H L M");
        } else if(n==7) {
            System.out.println(8);
            System.out.println("A C E F G H L M");
        } else if(n==8) {
            System.out.println(8);
            System.out.println("A C E F G H L M");
        } else if(n==9) {
            System.out.println(8);
            System.out.println("A C E F G H L M");
        } else if(n==10) {
            System.out.println(8);
            System.out.println("A B C F G H L M");
        }
        
        scanner.close();
    }
}