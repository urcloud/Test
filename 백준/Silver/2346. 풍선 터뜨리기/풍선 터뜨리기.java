import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<int[]> queue = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("1 ");
        int index = arr[0];

        for(int i=1; i<n; i++){
            queue.add(new int[] {(i+1), arr[i]}); //풍선 위치, 값
        }

        while(!queue.isEmpty()) {
            if(index >0) {
                for(int i=1; i< index; i++) {
                    queue.add(queue.poll());
                }

                int[] next = queue.poll();
                index = next[1];
                sb.append(next[0]+" ");
            }

            else {
                for(int i=1; i<-index; i++	) {
                    queue.addFirst(queue.pollLast());
                }

                int[] next = queue.pollLast();
                index = next[1];
                sb.append(next[0]+" ");
            }
        }

        System.out.println(sb.toString());
        br.close();
    }
}