import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 과목의 수
        int M = scanner.nextInt(); // 선수 조건의 수

        List<Integer>[] graph = new List[N + 1]; // 그래프
        int[] indegree = new int[N + 1]; // 진입 차수
        int[] semester = new int[N + 1]; // 각 과목의 이수 학기

        // 그래프 초기화
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 그래프 입력
        for (int i = 0; i < M; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            graph[A].add(B);
            indegree[B]++;
        }

        // 위상 정렬(Topological Sort)
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
                semester[i] = 1; // 진입 차수가 0인 과목은 1학기에 이수 가능
            }
        }

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int next : graph[cur]) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    queue.offer(next);
                    semester[next] = semester[cur] + 1; // 선수과목을 모두 이수한 이후에 이수 가능한 학기는 현재 과목의 이수 학기 + 1
                }
            }
        }

        // 결과 출력
        for (int i = 1; i <= N; i++) {
            System.out.print(semester[i] + " ");
        }
    }
}
