import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int [] arr = new int[1000001];
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
		
        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            if (arr[i] != 0) {
                for (int j = i * i; j < arr.length; j += i) {
                    arr[j] = 0;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            int num = i;
            int maxPrime = 0;

            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (arr[j] != 0 && num % j == 0) {
                    maxPrime = j;
                    while (num % j == 0) {
                        num /= j;
                    }
                }
            }

            if (num > 1) {
                maxPrime = num;
            }

            if (maxPrime <= k) {
                count++;
            }
        }

        System.out.println(count);
    }
}