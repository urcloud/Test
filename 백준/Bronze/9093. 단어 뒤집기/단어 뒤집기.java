import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            
            for(String str : s) {
                StringBuilder sb = new StringBuilder(str);
                System.out.print(sb.reverse().toString() + " ");
            }

            System.out.println();
        }
        br.close();
    }
}