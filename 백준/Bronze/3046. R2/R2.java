import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R1 = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        
        int R2 = S*2 - R1;
        bw.write(String.valueOf(R2));
        br.close();
        bw.flush();
        bw.close();
    }
}