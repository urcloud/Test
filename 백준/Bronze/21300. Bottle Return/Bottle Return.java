import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cent = new int[6];
        int total = 0;
        
        for(int i=0; i<6; i++) {
            cent[i] = scanner.nextInt();
            total += cent[i];
        }
        
        System.out.println(total*5);
        scanner.close();
    }
}