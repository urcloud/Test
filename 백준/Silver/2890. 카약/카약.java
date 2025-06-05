import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine();

        int[] d = new int[10];
        Arrays.fill(d, -1);

        for(int i=0; i<r; i++) {
            String s = scanner.nextLine();
            for(int j=0; j<c; j++) {
                char ch = s.charAt(j);
                if(ch>='1' && ch<='9') {
                    d[ch-'0'] = c-1-j;
                }
            }
        }

        int[] sorted = d.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for(int x:sorted){
            if(x != -1 && !rankMap.containsKey(x)){ 
                rankMap.put(x, rank);
                rank++;
            }
        }

        for(int i=1;i<=9;i++){
            System.out.println(rankMap.get(d[i]));
        }
    }
}