import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] str = new String[N];

        for(int i=0; i<N; i++) {
            str[i] = scanner.nextLine();
        }
        
        int len = str[0].length();
        StringBuilder sb = new StringBuilder();

        for(int j=0; j<len; j++) {
            boolean tf = true;
            char c = str[0].charAt(j);
            for(int k = 1; k<N; k++) {
                if(c != str[k].charAt(j)) {
                    tf = false;
                }
            }

            if(tf) {
                sb.append(c);
            } else {
                sb.append("?");
            }
        }

        System.out.println(sb);
        scanner.close();
    }
}