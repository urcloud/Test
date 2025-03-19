import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int d = scanner.nextInt();
		int h = scanner.nextInt();
		int m = scanner.nextInt();

		int result = 0;

		if(d < 11) {
			System.out.println("-1");
		}else if(d == 11) {
			if(h < 11) {
				System.out.println("-1");
			}else if(h == 11) {
				if(m >= 11) {
					result += m - 11;
					System.out.println(result);
				}else {
					System.out.println("-1");
				}
			}else if(h > 11) {
				if(m >= 11) {
					result += (h - 11) * 60 + m - 11;
					System.out.println(result);
				}else {
					result += (h - 12) * 60 + 60 - 11 + m;
					System.out.println(result);
				}
			}
		}else if(d > 11) {
			if(h > 11) {
				if(m >= 11) {
					result += (d - 11) * 24 * 60 + (h - 11) * 60 + m - 11;
					System.out.println(result);
				}else if(m < 11) {
					result += (d - 11) * 24 * 60 + (h - 12) * 60 + 60 - 11 + m;
					System.out.println(result);
				}
			}else if(h == 11) {
				if(m >= 11) {
					result += (d - 11) * 24 * 60 + m - 11;
					System.out.println(result);
				}else if(m < 11) {
					result += (d - 12) * 24 * 60 + 23 * 60 + 60 - 11 + m;
					System.out.println(result);
				}
			}else if(h < 11) {
				if(m >= 11) {
					result += (d - 12) * 24 * 60 + (24 - 11 + h) * 60 + m - 11;
					System.out.println(result);
				}else if(m < 11) {
					result += (d - 12) * 24 * 60 + (24 - 12 + h) * 60 + 60 - 11 + m;
					System.out.println(result);
				}
			}
		}
		
		scanner.close();
	}
}