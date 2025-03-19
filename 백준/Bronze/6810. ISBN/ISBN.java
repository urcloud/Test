import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int n = 91 + a + b*3 + c;

		System.out.println("The 1-3-sum is " + n);
		scanner.close();
	}
}