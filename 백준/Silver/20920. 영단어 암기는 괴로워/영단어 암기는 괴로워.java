import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> wordCount = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() >= M) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(wordCount.keySet());

        words.sort((w1, w2) -> {
            int freqCompare = Integer.compare(wordCount.get(w2), wordCount.get(w1));
            if (freqCompare != 0) return freqCompare;

            int lengthCompare = Integer.compare(w2.length(), w1.length());
            if (lengthCompare != 0) return lengthCompare;

            return w1.compareTo(w2);
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String word : words) {
            bw.write(word);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}