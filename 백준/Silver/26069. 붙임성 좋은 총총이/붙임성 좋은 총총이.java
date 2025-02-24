import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<String> dancers = new HashSet<>();
        dancers.add("ChongChong");

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();

            if (dancers.contains(A) || dancers.contains(B)) {
                dancers.add(A);
                dancers.add(B);
            }
        }

        bw.write(dancers.size() + "\n");
        
        bw.flush();
        br.close();
        bw.close();
    }
}
