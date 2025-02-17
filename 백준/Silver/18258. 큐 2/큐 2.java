import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>(); //양방향 큐
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            
            if (command.equals("push")) {
                queue.offer(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop")) {
                bw.write(queue.isEmpty() ? "-1\n" : queue.poll() + "\n");
            } else if (command.equals("size")) {
                bw.write(queue.size() + "\n");
            } else if (command.equals("empty")) {
                bw.write(queue.isEmpty() ? "1\n" : "0\n");
            } else if (command.equals("front")) {
                bw.write(queue.isEmpty() ? "-1\n" : queue.peek() + "\n");
            } else if (command.equals("back")) {
                bw.write(queue.isEmpty() ? "-1\n" : queue.peekLast() + "\n");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
