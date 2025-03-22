import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int result = 0;

		for(int i=0; i<5; i++) {
			int n = scanner.nextInt();
			if(n<40) {
				n=40;
			}
			result += n/5;
		}

		System.out.println(result);
		scanner.close();
	}
}

