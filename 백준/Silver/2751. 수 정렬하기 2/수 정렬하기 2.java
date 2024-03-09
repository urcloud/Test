import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        
        // 수 입력
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        
        // 배열 정렬
        Arrays.sort(numbers);
        
        // 정렬된 수 출력
        for (int i = 0; i < N; i++) {
            sb.append(numbers[i]).append('\n');
        }
        
        System.out.print(sb);
        br.close();
    }
}
