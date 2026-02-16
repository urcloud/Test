import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int[] arr = new int[26];

        for(int i=0; i<str.length(); i++) {
            int temp = str.charAt(i) - 'a';
            arr[temp]++;
        }

        for(int i=0; i<26; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}