import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        Set<String> inCompany = new TreeSet<>(Collections.reverseOrder());
        
        for(int i=0; i<N; i++) {
            String name, log;
            name = scanner.next();
            log = scanner.next();
            
            if ("enter".equals(log)) {
                inCompany.add(name);
            } else if ("leave".equals(log)) {
                inCompany.remove(name);
            }
        }
        
        for(String name : inCompany) {
            System.out.println(name);
        }
        
        scanner.close();
    }
}