import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int j = 1;
		while(n != 0) {
			for(int i = 0; i < n; i++) {
				int a = scanner.nextInt();
			}
			System.out.println("Case " + j + ": Sorting... done!");
			j++;
			n = scanner.nextInt();
		}
		scanner.close();
	}
}