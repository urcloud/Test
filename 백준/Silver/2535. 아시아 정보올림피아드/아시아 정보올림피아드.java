import java.util.*;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] arr = new int[n][3];

		for (int i = 0; i < n; i++) {
			arr[i][0] = scanner.nextInt();
			arr[i][1] = scanner.nextInt();
			arr[i][2] = scanner.nextInt();
		}

		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[2] - o1[2];
			}
		});

		int last = 2;
		if (arr[0][0] == arr[1][0]) {
			for (int i = 2; i < n; i++) {
				if (arr[0][0] != arr[i][0]) {
					last = i;
					break;
				}
			}
		}
		System.out.println(arr[0][0] + " " + arr[0][1]);
		System.out.println(arr[1][0] + " " + arr[1][1]);
		System.out.println(arr[last][0] + " " + arr[last][1]);
        scanner.close();
	}
}