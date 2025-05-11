import java.util.*;

public class B_cat {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> wordList = new ArrayList<>();
        String result = "";

        for(int i=0; i<n; i++){
            String words = scanner.next();
            wordList.add(words);
        }

        Collections.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length()-s2.length();
            }
        });

        for (String word : wordList) {
            result = result.concat(word);
        }

        System.out.println(result);
        scanner.close();
    }
}