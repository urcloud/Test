import java.util.Scanner;

public class Main {
	public static String Cantor(int n) {
        if (n == 0) {
            return "-";
        }
        
        String prev = Cantor(n - 1);
        String space = " ".repeat(prev.length());
        return prev + space + prev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(Cantor(n));
        }
        scanner.close();
    }
}
