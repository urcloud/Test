import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s1 = "*";
        String s2 = " ";

        for(int i=1; i<=n; i++) {
            String str1 = s1.repeat(i);
            String str2 = s2.repeat(2*(n-i));
            System.out.println(str1+str2+str1);
        }

        for(int i=n-1; i>0; i--) {
            String str1 = s1.repeat(i);
            String str2 = s2.repeat(2*(n-i));
            System.out.println(str1+str2+str1);
        }

        scanner.close();
    }
}