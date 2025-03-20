import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if(a*a == (b*b + c*c) || b*b == (a*a + c*c) || c*c == (a*a + b*b)) {
			System.out.println(1);
		} else if((a == b) && (b == c)) {
			System.out.println(2);
		} else {
			System.out.println(0);
		}

		scanner.close();
	}
}