import java.io.*;

public class A_22222 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();

        String S = br.readLine();

        for (char c : S.toCharArray()) {
            if(c == '2') {
                result.append(c);
            }
        }

        bw.write(result.toString());

        br.close();
        bw.flush();
        bw.close();
    }
}