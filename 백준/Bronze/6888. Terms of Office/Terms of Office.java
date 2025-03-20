import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		for(int i=x; i<=y; i+=60) {
			System.out.println("All positions change in year "+i);
		}
		scanner.close();
	}
}