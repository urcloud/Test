import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i=0; i<n; i++) {
            ts.add(scanner.nextInt());
        }

        Iterator iter = ts.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());

        scanner.close();
    }
}