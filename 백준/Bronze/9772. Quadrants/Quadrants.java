import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			if(x > 0 && y > 0) {
				System.out.println("Q1");
			}else if(x < 0 && y > 0) {
				System.out.println("Q2");
			}else if(x < 0 && y < 0) {
				System.out.println("Q3");
			}else if(x > 0 && y < 0) {
				System.out.println("Q4");
			}else if(x == 0 || y == 0) {
				System.out.println("AXIS");
			}
		}
		scanner.close();
	}
}