import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 수의 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        // 입력 범위가 10,000 이하의 자연수이므로, 카운트 배열 생성
        int[] count = new int[10001];
        
        // N개의 수를 카운트 배열에 기록
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }
        
        // 정렬된 배열의 수 출력
        for (int i = 1; i <= 10000; i++) {
            while (count[i]-- > 0) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}
