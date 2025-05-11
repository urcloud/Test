import java.util.*;

public class C_Variety_Split_Easy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];

        Set<Integer> set1 = new HashSet<>();
        int[] set1Size = new int[n];
        Set<Integer> set2 = new HashSet<>();
        int[] set2Size = new int[n];

        for(int i=0; i<n; i++) {
            num[i] = scanner.nextInt();
        }

        for(int j=0; j<n; j++) {
            set1.add(num[j]);
            set1Size[j] = set1.size();
        }

        for(int k=n-1; k>=0; k--) {
            set2.add(num[k]);
            set2Size[k] = set2.size();
        }

        int max = 0;
        for(int l=0; l<n-1; l++) {
            max = Math.max(max, set1Size[l]+set2Size[l+1]);
        }

        System.out.println(max);
        scanner.close();
    }
}