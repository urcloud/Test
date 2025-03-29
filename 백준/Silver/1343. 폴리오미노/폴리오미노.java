import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		str = str.replace("XXXX", "AAAA");
		str = str.replace("XX", "BB");

		if(str.contains("X")) {
			System.out.println(-1);
		} else {
			System.out.println(str);
		}

		scanner.close();
    }
}