import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        List<Integer> result = new ArrayList<>();

        while (queue.size() > 1) {
            result.add(queue.poll());
            queue.offer(queue.poll());
        }

        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println(queue.poll());
        scanner.close();
    }
}
