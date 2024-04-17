import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // 중간값보다 작은 값들을 저장
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 중간값보다 큰 값들을 저장

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (maxHeap.size() == minHeap.size()) {
                maxHeap.offer(num);
            } else {
                minHeap.offer(num);
            }

            // maxHeap의 최댓값이 minHeap의 최솟값보다 크면 swap
            if (!maxHeap.isEmpty() && !minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                int temp = maxHeap.poll();
                maxHeap.offer(minHeap.poll());
                minHeap.offer(temp);
            }

            sb.append(maxHeap.peek()).append("\n");
        }

        System.out.println(sb);
    }
}
