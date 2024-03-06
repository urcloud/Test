import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = Integer.parseInt(scanner.nextLine()); // 단어의 개수 N 입력
        
        Set<String> words = new HashSet<>(); // 중복된 단어를 제거하기 위해 Set을 사용
        
        // 단어를 입력받고 Set에 저장
        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();
            words.add(word);
        }
        
        List<String> wordList = new ArrayList<>(words); // Set을 List로 변환하여 정렬
        
        // 길이가 짧은 순서대로 정렬, 길이가 같으면 사전 순으로 정렬
        Collections.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                } else {
                    return s1.compareTo(s2);
                }
            }
        });
        
        // 정렬된 단어 출력
        for (String word : wordList) {
            System.out.println(word);
        }
        
        scanner.close();
    }
}
