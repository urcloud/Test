import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if(b<=a) {
			System.out.println("Congratulations, you are within the speed limit!");
		} else {
			if(1<=b-a && b-a<=20) {
				System.out.println("You are speeding and your fine is $100.");
			} else if(21<=b-a && b-a<=30) {
				System.out.println("You are speeding and your fine is $270.");
			} else {
				System.out.println("You are speeding and your fine is $500.");
			}
		}
		
		scanner.close();
	}
}