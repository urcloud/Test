import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] colors = new char[5];
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            colors[i] = sc.next().charAt(0);
            numbers[i] = sc.nextInt();
        }

        // 숫자 정렬
        Arrays.sort(numbers);

        // 숫자 개수 세기
        int[] count = new int[10]; // 1~9 사용
        for (int num : numbers) {
            count[num]++;
        }

        boolean sameColor = true;
        for (int i = 1; i < 5; i++) {
            if (colors[i] != colors[0]) {
                sameColor = false;
                break;
            }
        }

        boolean isStraight = true;
        for (int i = 1; i < 5; i++) {
            if (numbers[i] != numbers[i - 1] + 1) {
                isStraight = false;
                break;
            }
        }

        int maxNumber = numbers[4];

        int four = 0, three = 0;
        List<Integer> pairs = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            if (count[i] == 4) four = i;
            if (count[i] == 3) three = i;
            if (count[i] == 2) pairs.add(i);
        }

        int score = 0;

        // 1. 같은 색 + 연속
        if (sameColor && isStraight) {
            score = 900 + maxNumber;
        }
        // 2. 포카드
        else if (four != 0) {
            score = 800 + four;
        }
        // 3. 풀하우스
        else if (three != 0 && pairs.size() == 1) {
            score = 700 + three * 10 + pairs.get(0);
        }
        // 4. 플러시
        else if (sameColor) {
            score = 600 + maxNumber;
        }
        // 5. 스트레이트
        else if (isStraight) {
            score = 500 + maxNumber;
        }
        // 6. 트리플
        else if (three != 0) {
            score = 400 + three;
        }
        // 7. 투페어
        else if (pairs.size() == 2) {
            int big = Math.max(pairs.get(0), pairs.get(1));
            int small = Math.min(pairs.get(0), pairs.get(1));
            score = 300 + big * 10 + small;
        }
        // 8. 원페어
        else if (pairs.size() == 1) {
            score = 200 + pairs.get(0);
        }
        // 9. 아무것도 아님
        else {
            score = 100 + maxNumber;
        }

        System.out.println(score);
    }
}
