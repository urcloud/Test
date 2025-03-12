import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int time = scanner.nextInt();
        
        s += time;
        m += (s/60);
        s %= 60;
        h += m/60;
        m %= 60;
        h %= 24;

        System.out.println(h +" "+ m +" "+ s);
        scanner.close();
    }
}