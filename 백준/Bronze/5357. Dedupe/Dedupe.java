import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            char[] c = s.toCharArray();

            System.out.print(c[0]);
            for (int j = 1; j < c.length; j++) {
                if (c[j - 1] != c[j]) {
                    System.out.print(c[j]);
                }
            }
            System.out.println();
        }
    }
}