import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result = scanner.nextInt();

		for(int i=0; i<9; i++) {
			int n = scanner.nextInt();
			result -= n;
		}

		System.out.println(result);
		scanner.close();
	}
}