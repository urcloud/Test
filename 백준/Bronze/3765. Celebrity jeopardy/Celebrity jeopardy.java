import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
		while(scanner.hasNext()) {
			str = scanner.nextLine();
			System.out.println(str);
		}
		scanner.close();
    }
}