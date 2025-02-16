import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Set<String> rick = new HashSet<>(Arrays.asList(
            "Never gonna give you up",
            "Never gonna let you down",
            "Never gonna run around and desert you",
            "Never gonna make you cry",
            "Never gonna say goodbye",
            "Never gonna tell a lie and hurt you",
            "Never gonna stop"
        ));
        
        int N = scanner.nextInt();
        scanner.nextLine();
        
        boolean result = false;
        
        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            if (!rick.contains(str)) {
                result = true;
                break;
            }
        }
        
        System.out.println(result ? "Yes" : "No");
        scanner.close();
    }
}