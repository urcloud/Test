import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int result = 0;
        int startIndex = 0;

        while(true){
         	int findIndex = str1.indexOf(str2, startIndex);
                if(findIndex < 0) break;
            startIndex = findIndex + str2.length();
            result++;
        }

        System.out.println(result);
        scanner.close();
    }
}