import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String str;
        while ((str = br.readLine()) != null) {
            int small = 0;
            int capital = 0;
            int number = 0;
            int space = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == ' ') space++;
                if (Character.isUpperCase(c)) capital++;
                if (Character.isLowerCase(c)) small++;
                if (Character.isDigit(c)) number++;
            }
            sb.append(small + " " + capital + " " + number + " " + space + "\n");
        }
        System.out.print(sb);
    }
}