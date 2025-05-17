import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int cnt=0;
		
		for(int a=1;a<=n/3;a++) {
			for(int b=a;b<=(n-a)/2;b++) {
				int c=n-a-b;
				if(b>c) break;
				
				if(c<a+b) {
					cnt++;
					
				}
			}
		}
		
		System.out.println(cnt);
        scanner.close();
	}
}