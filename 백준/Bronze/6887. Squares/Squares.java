import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int result = (int) Math.sqrt(n);

		System.out.println("The largest square has side length "+result+".");
		scanner.close();
	}
}