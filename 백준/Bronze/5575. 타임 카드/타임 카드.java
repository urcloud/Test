import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for(int i=0; i<3; i++) {
			int h1 = scanner.nextInt();
			int m1 = scanner.nextInt();
			int s1 = scanner.nextInt();
			int h2 = scanner.nextInt();
			int m2 = scanner.nextInt();
			int s2 = scanner.nextInt();

			int start = (h1*3600) + (m1*60) + s1;
			int end = (h2*3600) + (m2*60) + s2;
			
			int time = end-start;
			int h = time/3600;
			int m = (time%3600)/60;
			int s = (time%3600)%60;

			System.out.println(h+" "+m+" "+s);
		}
		scanner.close();
	}
}