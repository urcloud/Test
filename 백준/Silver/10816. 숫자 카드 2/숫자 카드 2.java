import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 상근이가 가지고 있는 숫자 카드의 개수 N 입력
        int N = Integer.parseInt(br.readLine());

        // 각 숫자 카드의 등장 횟수를 저장하는 HashMap 생성
        HashMap<Integer, Integer> cards = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            cards.put(num, cards.getOrDefault(num, 0) + 1);
        }

        // 확인할 숫자의 개수 M 입력
        int M = Integer.parseInt(br.readLine());

        // 확인할 숫자에 대해 HashMap을 이용하여 등장 횟수를 출력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            bw.write(cards.getOrDefault(target, 0) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
