import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        
        //좌 우 최소
        int x_min = Math.min(x, w-x);
        //상 하 최소
        int y_min = Math.min(y, h-y);
        
        System.out.println(Math.min(x_min, y_min));
    }
}