import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();

		int result = a+b+c+d;
		int x = result/60;
		int y = result%60;

		System.out.println(x);
		System.out.println(y);

		scanner.close();
	}
}