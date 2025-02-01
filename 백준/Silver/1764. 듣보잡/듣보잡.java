import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        HashSet<String> set = new HashSet<>();
        List<String> name = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            set.add(scanner.nextLine());
        }

        for (int i = 0; i < M; i++) {
            String st = scanner.nextLine();
            if (set.contains(st)) {
                name.add(st);
            }
        }
        
        Collections.sort(name);

        System.out.println(name.size());
        for (String n : name) {
            System.out.println(n);
        }

        scanner.close();
    }
}
