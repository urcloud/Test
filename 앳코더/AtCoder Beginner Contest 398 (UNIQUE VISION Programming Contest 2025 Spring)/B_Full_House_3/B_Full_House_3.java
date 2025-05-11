import java.util.*;

public class B_Full_House_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Map<Integer, Integer> count = new HashMap<>();
        
        for (int i = 0; i < 7; i++) {
            int num = scanner.nextInt();
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        boolean fullHouse = false;
        
        for (Map.Entry<Integer, Integer> entry1 : count.entrySet()) {
            for (Map.Entry<Integer, Integer> entry2 : count.entrySet()) {
                if (!entry1.getKey().equals(entry2.getKey())) {
                    int count1 = entry1.getValue();
                    int count2 = entry2.getValue();
                    
                    if ((count1 >= 3 && count2 >= 2) || (count1 >= 2 && count2 >= 3)) {
                        fullHouse = true;
                    }
                }
            }
        }
        
        System.out.println(fullHouse ? "Yes" : "No");
        scanner.close();
    }
}