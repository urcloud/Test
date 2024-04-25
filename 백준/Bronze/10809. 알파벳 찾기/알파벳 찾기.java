import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next(); // 단어 입력
        int[] positions = new int[26]; // 알파벳 위치 저장 배열

        // 초기화: 모든 알파벳 위치를 -1로 설정
        Arrays.fill(positions, -1);

        // 각 알파벳의 위치를 저장
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a'; // 알파벳의 인덱스 계산
            if (positions[index] == -1) { // 해당 알파벳이 처음 등장하는 경우에만 위치 저장
                positions[index] = i;
            }
        }

        // 결과 출력
        for (int i = 0; i < 26; i++) {
            System.out.print(positions[i] + " ");
        }
    }
}
