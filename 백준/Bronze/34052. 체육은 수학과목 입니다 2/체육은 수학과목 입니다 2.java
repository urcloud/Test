import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = 1800;

        for(int i=0; i<4; i++) {
            int n = scanner.nextInt();
            time -= n;
        }

        if(time < 300) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        scanner.close();
    }
}