import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        Queue<Integer> queue = new LinkedList<>();
        // 큐에 카드 번호 넣기
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        
        // 마지막으로 남는 카드 찾기
        while (queue.size() > 1) {
            queue.poll(); // 제일 위에 있는 카드를 버림
            int movedCard = queue.poll(); // 제일 위에 있는 카드를 제일 아래로 옮김
            queue.offer(movedCard);
        }
        
        // 마지막으로 남는 카드 출력
        System.out.println(queue.poll());
    }
}
