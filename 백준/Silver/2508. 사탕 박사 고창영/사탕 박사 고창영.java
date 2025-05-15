import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int candy = 0;
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            scanner.nextLine();

            char[][] arr = new char[r][c];
            for(int j = 0; j < r; j++) {
                String box = scanner.nextLine();
                for(int k = 0; k < c; k++) {
                    arr[j][k] = box.charAt(k);
                }
            }

            for(int j = 0; j < r; j++) {
                for(int k = 0; k < c; k++) {
                    if(k < c-2 && arr[j][k] == '>' && arr[j][k+1] == 'o' && arr[j][k+2] == '<') {
                        candy++;
                    }
                    if(j < r-2 && arr[j][k] == 'v' && arr[j+1][k] == 'o' && arr[j+2][k] == '^') {
                        candy++;
                    }
                }
            }
            System.out.println(candy);
        }
        scanner.close();
    }
}