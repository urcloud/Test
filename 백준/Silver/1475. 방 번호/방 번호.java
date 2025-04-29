import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int arr[] = new int[10];

        for(int i=0; i<str.length(); i++) {
            int n = str.charAt(i) - '0';

            if(n == 9) {
                n = 6;
            }
            
            arr[n]++;
        }

        arr[6] = (arr[6]/2 + arr[6]%2);

        Arrays.sort(arr);
        System.out.println(arr[9]);
        scanner.close();
    }
}