import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String str  = scanner.nextLine();
			if(str.equals("TTYL")) {
				System.out.println("talk to you later");
				break;
			}

			if(str.equals("CU")) {
				System.out.println("see you");
			} else if (str.equals(":-)")) {
				System.out.println("I’m happy");
			} else if (str.equals(":-(")) {
				System.out.println("I’m unhappy");
			} else if (str.equals(";-)")) {
				System.out.println("wink");
			} else if(str.equals(":-P")) {
				System.out.println("stick out my tongue");
			} else if (str.equals("(~.~)")) {
				System.out.println("sleepy");
			} else if (str.equals("TA")) {
				System.out.println("totally awesome");
			} else if (str.equals("CCC")) {
				System.out.println("Canadian Computing Competition");
			} else if (str.equals("CUZ")) {
				System.out.println("because");
			} else if (str.equals("TY")) {
				System.out.println("thank-you");
			} else if (str.equals("YW")) {
				System.out.println("you’re welcome");
			} else {
				System.out.println(str);
			}
		}
		scanner.close();
	}
}