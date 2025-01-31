import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); //개행문자 제거
        
        int C = 0;
        HashSet<String> set = new HashSet<>();
        
        for(int i=0; i<N; i++) {
            set.add(scanner.nextLine());
        }
        
        for(int i=0; i<M; i++) {
            String st = scanner.nextLine();
            if (set.contains(st)) {
                C++;
            }
        }
        
        System.out.println(C);
        scanner.close();
    }
}