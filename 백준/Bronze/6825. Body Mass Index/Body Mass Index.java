import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();

		double bmi = a/(b*b);

		if(bmi>25) {
			System.out.println("Overweight");
		} else if (bmi>=18.5 && bmi<=25.0) {
			System.out.println("Normal weight");
		} else {
			System.out.println("Underweight");
		}
		scanner.close();
	}
}