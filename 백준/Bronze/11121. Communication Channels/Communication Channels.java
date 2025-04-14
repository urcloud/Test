import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		for(int i = 0; i < n; i++) {
			String a = scanner.next();
			String b = scanner.next();
			if(a.length() != b.length()) {
				System.out.println("ERROR");
			}else {
				int j;
				for(j = 0; j < a.length(); j++) {
					if(a.charAt(j) != b.charAt(j)) {
						break;
					}
				}
				
				if(j == a.length()) {
					System.out.println("OK");
				}else {
					System.out.println("ERROR");
				}
			}
		}
		scanner.close();
	}
}