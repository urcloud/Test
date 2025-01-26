import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.nextLine();
        
        Set<String> inCompany = new TreeSet<>(Collections.reverseOrder());
        
        for(int i=0; i<N; i++) {
            String log = scanner.nextLine();
            String[] sp = log.split(" ");
            String name = sp[0];
            String action = sp[1];
            
            if (action.equals("enter")) {
                inCompany.add(name);
            } else if (action.equals("leave")) {
                inCompany.remove(name);
            }
        }
        
        for(String name : inCompany) {
            System.out.println(name);
        }
        
        scanner.close();
    }
}