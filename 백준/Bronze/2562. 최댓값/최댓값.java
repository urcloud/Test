import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int max = 0; // 최댓값을 저장할 변수
        int index = 0; // 최댓값의 위치를 저장할 변수
        
        // 9개의 수를 입력받으면서 최댓값과 그 위치를 찾음
        for (int i = 1; i <= 9; i++) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
                index = i;
            }
        }
        
        // 최댓값과 그 위치를 출력
        System.out.println(max);
        System.out.println(index);
        
        scanner.close();
    }
}
