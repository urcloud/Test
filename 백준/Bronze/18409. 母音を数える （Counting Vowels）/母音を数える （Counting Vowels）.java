import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();

        String vowels = "aiueo";
        int count = 0;

        for (int i = 0; i < N; i++) {
            char ch = S.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        
        System.out.println(count);

        scanner.close();
    }
}