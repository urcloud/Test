import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int d = scanner.nextInt();
		int count = 0;

		for(int i=0; i<5; i++) {
			int n = scanner.nextInt();
			if(n==d) count ++;
		}

		System.out.println(count);
		scanner.close();
	}
}