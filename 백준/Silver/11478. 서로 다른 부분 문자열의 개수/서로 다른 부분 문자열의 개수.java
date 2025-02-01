import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j <= st.length(); j++) {
                set.add(st.substring(i, j));
            }
        }

        System.out.println(set.size());
        scanner.close();
    }
}