import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int year1 = 2024;
        int month1 = 8;
        
        int add = month1 + (N-1)*7;
        int y = year1 + (add - 1) / 12;
        int m = (add - 1) % 12 + 1;
        
        System.out.println(y + " " + m);
		scanner.close();
    }
}