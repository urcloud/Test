import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		String c = scanner.next();
		String d = scanner.next();

		long x = Long.parseLong(a+b);
		long y = Long.parseLong(c+d);

		System.out.println(x+y);
		scanner.close();
    }
}
