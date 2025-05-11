import java.util.Scanner;

public class A_Doors_in_the_Center {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];

        if(n%2==0) {
            for(int i=0; i<n; i++) {
                str[i] = "-";
                str[n/2] = "=";
                str[(n/2)-1] = "=";
                System.out.print(str[i]);
            }
        } else {
            for(int i=0; i<n; i++) {
                str[i] = "-";
                str[n/2] = "=";
                System.out.print(str[i]);
            }
        }

        scanner.close();
    }
}