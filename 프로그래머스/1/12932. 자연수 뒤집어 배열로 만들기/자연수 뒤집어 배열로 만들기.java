import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(Arrays.toString(solution(n)));
        scanner.close();
    }

    public static int[] solution(long n) {
        List<Integer> list = new ArrayList<>();

        while (n > 0) {
            list.add((int)(n % 10));
            n = n / 10;
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}