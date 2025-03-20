import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] strr = new String[str.length()];
		List<String> strList = Arrays.asList(strr);

		for(int i=0; i<str.length(); i++) {
			strr[i] = str.substring(i, str.length());
		}

		Collections.sort(strList, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});

		for(String strword : strList) {
			System.out.println(strword);
		}

		scanner.close();
	}
}