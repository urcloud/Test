import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		if(k*n<=m) {
			System.out.println(0);
		} else {
			System.out.println(k*n - m);
		}
		scanner.close();
	}
}