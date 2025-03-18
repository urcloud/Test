import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a1 = scanner.nextInt();
		int b1 = scanner.nextInt();
		int c1 = scanner.nextInt();
		int d1 = scanner.nextInt();
		int result1 = a1+b1+c1+d1;

		int a2 = scanner.nextInt();
		int b2 = scanner.nextInt();
		int c2 = scanner.nextInt();
		int d2 = scanner.nextInt();
		int result2 = a2+b2+c2+d2;

		if(result1>result2) {
			System.out.println(result1);
		} else {
			System.out.println(result2);
		}

		scanner.close();
	}
}