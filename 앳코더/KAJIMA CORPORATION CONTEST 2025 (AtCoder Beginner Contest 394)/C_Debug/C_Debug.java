import java.io.*;

public class C_Debug {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; (i = sb.indexOf("WA", i)) != -1; ) {
            sb.replace(i, i + 2, "AC");
            if (i > 0) i--;
        }

        bw.write(sb.toString());
        
        br.close();
        bw.flush();
        bw.close();
    }
}