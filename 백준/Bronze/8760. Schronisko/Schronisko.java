import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] num = new int[n][2];

		for(int i=0; i<n; i++) {
			num[i][0] = scanner.nextInt();
			num[i][1] = scanner.nextInt();

			int result = num[i][0] * num[i][1] / 2;
			System.out.println(result);
		}

		scanner.close();
	}
}