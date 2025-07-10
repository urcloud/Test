import java.util.Scanner;
 
public class Main {
 
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long count = 0;

        if(a<b) {
            count = b-a-1;
            System.out.println(count);

            for(long i=a+1; i<b; i++) {
                System.out.printf(i+" ");
            }
        } else if(a>b) {
            count = a-b-1;
            System.out.println(count);

            for(long i=b+1; i<a; i++) {
                System.out.printf(i+" ");
            }
        } else {
            count = 0;
            System.out.println(count);
        }

        scanner.close();
    }
}
