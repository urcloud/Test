import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int burger = 2001;
		int drink = 2001;
 
		for (int i = 0; i < 3; i++) {
			int value = in.nextInt();
			if (value < burger) {
				burger = value;
			}
		}
 
		for (int i = 0; i < 2; i++) {
			int value = in.nextInt();
			if (value < drink) {
				drink = value;
			}
		}
 
		System.out.println(burger + drink - 50);
	}
 
}