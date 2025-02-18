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
            
            if (command.equals("1")) {
                queue.offerFirst(Integer.parseInt(st.nextToken()));
            } else if (command.equals("2")) {
                queue.offerLast(Integer.parseInt(st.nextToken()));
            } else if (command.equals("3")) {
                bw.write(queue.isEmpty() ? "-1\n" : queue.pollFirst() + "\n");
            } else if (command.equals("4")) {
                bw.write(queue.isEmpty() ? "-1\n" : queue.pollLast() + "\n");
            } else if (command.equals("5")) {
                bw.write(queue.size() + "\n");
            } else if (command.equals("6")) {
                bw.write(queue.isEmpty() ? "1\n" : "0\n");
            } else if (command.equals("7")) {
                bw.write(queue.isEmpty() ? "-1\n" : queue.peekFirst() + "\n");
            } else if (command.equals("8")) {
                bw.write(queue.isEmpty() ? "-1\n" : queue.peekLast() + "\n");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}