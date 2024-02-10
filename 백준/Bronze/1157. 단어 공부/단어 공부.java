import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        String word = scanner.nextLine().toLowerCase(); // 소문자로 변환하여 대소문자를 구분하지 않음
        
        // 알파벳 빈도수 계산
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLetter(ch)) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }
        
        // 가장 많이 사용된 알파벳 찾기
        char mostFrequentChar = '?'; // 초기값을 '?'로 설정
        int maxFrequency = 0;
        boolean isMultiple = false; // 가장 빈도가 높은 알파벳이 여러 개인지 여부를 나타내는 변수
        for (char ch : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(ch);
            if (frequency > maxFrequency) {
                mostFrequentChar = ch;
                maxFrequency = frequency;
                isMultiple = false; // 이전에 찾은 알파벳보다 현재 알파벳이 더 빈도가 높으므로 다시 초기화
            } else if (frequency == maxFrequency) {
                isMultiple = true; // 최대 빈도수와 같은 알파벳이 여러 개 있음을 표시
            }
        }
        
        // 출력
        if (!isMultiple) {
            System.out.println(Character.toUpperCase(mostFrequentChar)); // 대문자로 출력
        } else {
            System.out.println('?');
        }
        
        scanner.close();
    }
}
