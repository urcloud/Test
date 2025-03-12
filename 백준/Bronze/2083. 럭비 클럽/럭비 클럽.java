import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String str = scanner.nextLine();
            StringBuilder sb = new StringBuilder();

            if(str.equals("# 0 0")) {
                break;
            }

            String[] club = str.split(" ");
            sb.append(club[0]);
            int age = Integer.parseInt(club[1]);
            int weight = Integer.parseInt(club[2]);
            if(age>17 || weight>=80) {
                sb.append(" Senior");
            } else {
                sb.append(" Junior");
            }
            
            System.out.println(sb);
         }
        scanner.close();
    }
}