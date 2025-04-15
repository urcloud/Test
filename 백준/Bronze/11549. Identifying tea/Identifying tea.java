import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;

		for(int i=0; i<5; i++) {
			int s = scanner.nextInt();

			if(n==s) {
				count ++;
			}
		}
		
		System.out.println(count);
	}
}