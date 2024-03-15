import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거
        
        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }
        
        StringBuilder result = new StringBuilder("<");
        int index = 0;
        while (!people.isEmpty()) {
            index = (index + K - 1) % people.size();
            result.append(people.remove(index));
            if (!people.isEmpty()) {
                result.append(", ");
            }
        }
        result.append(">");
        
        System.out.println(result.toString());
    }
}
