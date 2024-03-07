import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // N번째 영화의 번호
        
        int count = 0; // 종말의 수 카운트
        int number = 665; // 현재 수
        
        while (true) {
            number++; // 다음 수로 이동
            
            // 현재 수에 6이 적어도 3개 이상 연속으로 들어가는지 확인
            if (String.valueOf(number).contains("666")) {
                count++; // 종말의 수 발견
                
                // N번째 종말의 수를 찾았으면 출력 후 종료
                if (count == N) {
                    System.out.println(number);
                    break;
                }
            }
        }
        
        scanner.close();
    }
}
