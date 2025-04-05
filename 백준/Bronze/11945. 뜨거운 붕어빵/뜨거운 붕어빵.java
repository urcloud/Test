import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		for (int i = 0; i < x; i++) {
			while (scanner.hasNext()) {
				StringBuilder sb = new StringBuilder(scanner.next());
				System.out.println(sb.reverse());
			}
		}
		scanner.close();
	}
}