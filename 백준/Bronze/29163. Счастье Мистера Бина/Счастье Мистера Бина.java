import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i<N; i++) {
            int S = scanner.nextInt();
            if(S%2 == 0) {
                count1 ++;
            } else {
                count2 ++;
            }
        }
        
        if(count1>count2) {
            System.out.println("Happy");
        } else if(count1<=count2) {
            System.out.println("Sad");
        }
        
        scanner.close();
    }
}