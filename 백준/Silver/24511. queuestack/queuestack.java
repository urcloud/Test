import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] listQueuestack = new int[N];
        int[] currentList = new int[N];

        StringBuilder answer = new StringBuilder();
        StringTokenizer input1 = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            listQueuestack[i] = Integer.parseInt(input1.nextToken());
        }
        
        StringTokenizer input2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            currentList[i] = Integer.parseInt(input2.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] insertList = new int[M];
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < M; i++) {
            insertList[i] = Integer.parseInt(st3.nextToken());
        }
        
        Deque<Integer> queue = new ArrayDeque<>();
        
        for (int i = 0; i < N; i++) {
            if (listQueuestack[i] == 0) {
                queue.addFirst(currentList[i]);
            }
        }
        
        for (int i = 0; i < M; i++) {
            queue.add(insertList[i]);
            answer.append((queue.pollFirst() + " "));
        }

        System.out.println(answer);
        br.close();
    }
}