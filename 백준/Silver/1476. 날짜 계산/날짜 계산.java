import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int E = scanner.nextInt();
        int M = scanner.nextInt();
        int S = scanner.nextInt();
        int year = 0;

        while (true) {
            year++;
            if((year-E)%15==0 && (year-M)%28==0 && (year-S)%19==0){
                break;
            }
        }

        System.out.print(year);
        scanner.close();
    }
}