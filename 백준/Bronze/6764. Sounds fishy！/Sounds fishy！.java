import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();

		if(a<b && b<c && c<d) {
			System.out.println("Fish Rising");
		} else if(d<c && c<b && b<a) {
			System.out.println("Fish Diving");
		} else if(d==c && c==b && b==a) {
			System.out.println("Fish At Constant Depth");
		} else {
			System.out.println("No Fish");
		}

		scanner.close();
	}
}