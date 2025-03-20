import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		long b = scanner.nextLong();

		if(a*b%2 ==0) {
			System.out.println(0);
		} else {
			if(a>b) {
				System.out.println(b);
			} else {
				System.out.println(a);
			}
		}
		scanner.close();
	}
}