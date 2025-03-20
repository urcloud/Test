import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int n = scanner.nextInt();
			if(n==0) {
				break;
			}

			for(int i=1; i<=n; i++) {
				System.out.print("*".repeat(i));
				System.out.println();
			}
		}
		scanner.close();
	}
}