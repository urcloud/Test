import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> n = new ArrayList<>();
        for(int i=0; i<3; i++) {
            n.add(scanner.nextInt());
        }

        Collections.sort(n);

        for (int i : n) {
            System.out.print(i+" ");
        }
        scanner.close();
    }
}