import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] classes = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                classes[i][j] = scanner.nextInt();
            }
        }

        int maxCount = 0;
        int leader = 0;

        for (int i = 0; i < n; i++) {
            Set<Integer> classmates = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                for (int k = 0; k < 5; k++) {
                    if (classes[i][k] == classes[j][k]) {
                        classmates.add(j);
                        break;
                    }
                }
            }
            
            if (classmates.size() > maxCount) {
                maxCount = classmates.size();
                leader = i;
            }
        }
        
        System.out.println(leader + 1);
        scanner.close();
    }
}