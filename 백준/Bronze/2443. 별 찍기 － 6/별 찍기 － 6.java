import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s1 = "*";
        String s2 = " ";

        for(int i=n; i>0; i--) {
            String str1 = s1.repeat(2*i-1);
            String str2 = s2.repeat(n-i);
            System.out.println(str2+str1);
        }

        scanner.close();
    }
}