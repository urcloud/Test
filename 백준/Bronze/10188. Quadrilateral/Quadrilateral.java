import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for(int i=0; i<n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			for(int j=0; j<b; j++) {
				System.out.println("X".repeat(a));
			}
			System.out.println();
		}
		scanner.close();
	}
}