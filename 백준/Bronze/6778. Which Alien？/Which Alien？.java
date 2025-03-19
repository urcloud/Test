import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if(a>=3 && 4>=b) {
			System.out.println("TroyMartian");
		}
		
		if(6>=a && b>=2) {
			System.out.println("VladSaturnian");
		} 
		
		if (2>=a && 3>=b) {
			System.out.println("GraemeMercurian");
		}

		scanner.close();
	}
}