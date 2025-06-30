import java.util.Scanner;

public class Main {
	public static int[] arr;
	public static int n, m;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();

		arr = new int[m];

		dfs(0, 1);
		System.out.print(sb);
	}

	public static void dfs(int depth, int start) {
		if (depth == m) {
			for (int i = 0; i < m; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}

		for (int i = start; i <= n; i++) {
			arr[depth] = i;
			dfs(depth + 1, i);
        }
	}
}