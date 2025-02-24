import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int count = 0;

        for(int i=0; i<n; i++) {
            String str = br.readLine();

            if(str.equals("ENTER")) {
                set.clear();
            } else if(set.add(str)) {
                count++;
            }
        }

        bw.write(count + "\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}