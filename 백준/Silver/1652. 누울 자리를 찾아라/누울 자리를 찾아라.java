import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		char[][] map = new char[101][101];
		int hor = 0;
		int ver = 0;
		
		for(int i=0; i<n; i++) {
			String s = scanner.next();
			for(int j=0; j<n; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		
		for(int i=0; i<n; i++) {
			int check_h = 0, check_v = 0;
			for(int j=0; j<n; j++) {
				if(map[i][j] == '.') check_h++;
				if(map[i][j] == 'X' || (j == n-1)) {
					if(check_h >= 2) hor++;
					check_h = 0;
				}
				
				if(map[j][i] == '.') check_v++;
				if(map[j][i] == 'X' || (j == n-1)) {
					if(check_v >= 2) ver++;
					check_v = 0;
				}
			}
		}
		
		System.out.println(hor + " " + ver);
        scanner.close();
	}
}