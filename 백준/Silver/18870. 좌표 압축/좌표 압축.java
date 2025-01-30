import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        //좌표 원소 순위 매기기
        //HashMap key에 정렬된 배열 넣고 value에 순위 매기기

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] origin = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < N; i++) {
            sorted[i] = origin[i] = in.nextInt();
        }

        Arrays.sort(sorted);

        int rank = 0;
        for(int v : sorted) {
            if(!rankingMap.containsKey(v)) {
                rankingMap.put(v, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : origin) {
            int ranking = rankingMap.get(key);
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);
    }
}