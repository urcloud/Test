import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
        HashSet<Integer> AB = new HashSet<>();
        
        for(int i=0; i<N; i++) {
            A.add(scanner.nextInt());
        }
        
        for(int i=0; i<M; i++) {
            int C = scanner.nextInt();
            B.add(C);
            if(A.contains(C)) {
                AB.add(C);
            }
        }
        
        int result = (A.size()-AB.size()) + (B.size()-AB.size());
        System.out.println(result);
        
        scanner.close();
    }
}