import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		List<Integer> row = new ArrayList<Integer>();
		List<Integer> column = new ArrayList<Integer>();
		
		row.add(scanner.nextInt());
		column.add(scanner.nextInt());	
		int n = scanner.nextInt();
	
		for(int i=0; i<n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if(a == 0) {
				int index;
				for(index = 0  ; b - column.get(index)>0 ; index++ ) {
					b -= column.get(index);
				}
				int temp = column.remove(index);
				column.add(index,temp-b);
				column.add(index,b);
			}
			else {
				int index;
				for(index = 0  ; b - row.get(index)>0 ; index++ ) {
					b -= row.get(index);
				}
				int temp = row.remove(index);
				row.add(index,temp-b);
				row.add(index,b);
			}
		}

		int max = 0;
		for(int i : row) {
			for(int j : column)
				max = Math.max(i*j, max);
		}

		System.out.println(max);
		scanner.close();
	}
}