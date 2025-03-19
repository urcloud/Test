import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int n = b-a;

		System.out.println(b+n);
		scanner.close();
	}
}