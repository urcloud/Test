import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = null;
		
		while((input = br.readLine()) != null) {
			for(int i=0; i<input.length(); i++) {
				char c = input.charAt(i);
				if(c == 'i') sb.append('e');
				else if(c == 'e') sb.append('i');
				else if(c == 'I') sb.append('E');
				else if(c == 'E') sb.append('I');
				else sb.append(c);
				
			}
			sb.append(System.lineSeparator());
		}
		
		System.out.print(sb);

	}
}