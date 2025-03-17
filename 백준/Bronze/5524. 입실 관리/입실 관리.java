import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for(int i=0; i<n; i++) {
			String str = br.readLine();

			for(int j=0; j<str.length(); j++) {
				if (Character.isUpperCase(str.charAt(j))) {
					sb.append(Character.toLowerCase(str.charAt(j)));
				} else {
					sb.append(str.charAt(j));
				}
			}
			sb.append("\n");
		}

		bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}
}