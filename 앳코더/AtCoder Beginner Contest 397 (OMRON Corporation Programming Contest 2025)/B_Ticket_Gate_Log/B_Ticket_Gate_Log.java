import java.util.*;

public class B_Ticket_Gate_Log {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int count = 0;

        for(int i=0; i<sb.length(); i++) {
            if (i%2==1 && sb.charAt(i)!='o') {
                sb.insert(i, 'o');
                count++;
            } else if (i%2==0 && sb.charAt(i)!='i') {
                sb.insert(i, 'i');
                count++;
            }
        }

        if (sb.length()%2==1) {
            count++;
        }

        System.out.println(count);
        scanner.close();
    }
}