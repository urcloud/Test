import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        if(B>=A) {
            bw.write(String.valueOf(B-A));
        } else {
            bw.write(String.valueOf((24-A)+B));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}