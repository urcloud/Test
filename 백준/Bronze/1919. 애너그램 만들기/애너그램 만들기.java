import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int[] num = new int[26];
        int count = 0;

        for(int i=0; i<str1.length(); i++) {
            num[(str1.charAt(i)-'a')]++;
        }

        for (int i = 0; i<str2.length(); i++) {
            num[str2.charAt(i) - 'a']--;
        }

        for (int i = 0; i<26; i++) {
            count += Math.abs(num[i]);
        }

        System.out.println(count);
        scanner.close();
    }
}
