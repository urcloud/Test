import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int L = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		int math = 0;
		int read = 0;

		if(A%C == 0) {
			read = A/C;
		} else {
			read = A/C + 1;
		}

		if(B%D == 0) {
			math = B/D;
		} else {
			math = B/D + 1;
		}

		if(read>math) {
			int result = L - read;
			System.out.println(result);
		} else {
			int result = L - math;
			System.out.println(result);
		}
		
		scanner.close();
	}
}