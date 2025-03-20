import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int w = scanner.nextInt();
		int m = scanner.nextInt();

		int result = (w-k);

		if(result%m == 0) {
			System.out.println(result/m);
		} else {
			System.out.println(result/m + 1);
		}
		
		scanner.close();
	}
}