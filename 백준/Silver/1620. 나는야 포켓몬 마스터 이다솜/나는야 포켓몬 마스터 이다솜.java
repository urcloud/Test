import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        ArrayList<String> plist = new ArrayList<>(N);
        
        HashMap<String, Integer> pmap = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            String name = scanner.next();
            plist.add(name);
            pmap.put(name, i + 1);
        }
        
        for (int i = 0; i < M; i++) {
            String q = scanner.next();
            
            if (q.charAt(0) >= '1' && q.charAt(0) <= '9') {
                int num = Integer.parseInt(q);
                System.out.println(plist.get(num - 1));
            } else {
                System.out.println(pmap.get(q));
            }
        }

        scanner.close();
    }
}