import java.util.Scanner;

public class Main {
	static char[][] arr;

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		arr = new char[n][n];

		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ' ';
            }
        }

		star(0, 0, n);

		StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);

		scanner.close();
	}

	static void star(int x, int y, int size) {
        if (size == 1) {
            arr[x][y] = '*';
            return;
        }
        
        int newSize = size / 3;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) continue;
                star(x + i * newSize, y + j * newSize, newSize);
            }
        }
    }
}