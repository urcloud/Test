import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] max = new int[3];
        int[] mel = new int[3];
        
        for(int i=0; i<3; i++) {
            max[i] = scanner.nextInt();
        }
        for(int i=0; i<3; i++) {
            mel[i] = scanner.nextInt();
        }
        
        int maxt = max[0]*3 + max[1]*20 + max[2]*120;
        int melt = mel[0]*3 + mel[1]*20 + mel[2]*120;
        
        if(maxt>melt) {
            System.out.println("Max");
        } else if(maxt==melt) {
            System.out.println("Draw");
        } else {
            System.out.println("Mel");
        }
        
        scanner.close();
    }
}