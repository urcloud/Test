import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        String str;
        
        while ((str = br.readLine()) != null) {
            str = str.trim();
            if (str.isEmpty()) continue;

            String[] num = str.split(" ");
            int n = Integer.parseInt(num[0]);

            if (n == 0) break;

            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = Integer.parseInt(num[i + 1]);
            }

            double median;
            if (n % 2 == 1) {
                median = result[n / 2];
            } else {
                median = (result[n / 2 - 1] + result[n / 2]) / 2.0;
            }

            System.out.printf("Case %d: %.1f\n", count++, median);
        }
		
        br.close();
    }
}
