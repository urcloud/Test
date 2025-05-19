import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> answer = new ArrayList<Integer>();


		int k = 0;
		int count = 0;
		for (int i=n/2; i<=n; i++) {
			int index = 0;
			arr.add(n);
			arr.add(i);
			
			while (true) {
				k = arr.get(index) - arr.get(index + 1);
				if (k < 0)
					break;
				else {
					arr.add(k);
					index++;
				}
			}

			if(arr.size()>count) {
				answer.clear();
				count=arr.size();
				answer.addAll(arr);
			}
			
			arr.clear();
		}

		System.out.println(count);
		for (int i = 0; i < answer.size(); i++) {
			System.out.print(answer.get(i) + " ");
		}
	}
}