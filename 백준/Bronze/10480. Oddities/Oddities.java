import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for(int i=0; i<n; i++) {
			int a = scanner.nextInt();

			if(a%2==0) {
				System.out.println(a + " is even");
			} else {
				System.out.println(a + " is odd");
			}
		}
		scanner.close();
	}
}