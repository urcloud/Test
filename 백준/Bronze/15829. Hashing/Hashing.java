import java.util.Scanner;

public class Main {
    // 해시 함수에 사용할 상수 설정
    static final int r = 31;
    static final long M = 1234567891;
    
    // 문자열을 해시 값으로 변환하는 함수
    static long hashString(String str) {
        long hashVal = 0;
        for (int i = 0; i < str.length(); i++) {
            hashVal += (str.charAt(i) - 'a' + 1) * power(r, i) % M;
            hashVal %= M;
        }
        return hashVal;
    }
    
    // 거듭제곱을 계산하는 함수
    static long power(int base, int exponent) {
        if (exponent == 0) return 1;
        long result = power(base, exponent / 2);
        result = (result * result) % M;
        if (exponent % 2 == 1) result = (result * base) % M;
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 문자열의 길이 입력
        int L = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기
        
        // 문자열 입력
        String s = scanner.nextLine();
        
        // 해시 값 계산 및 출력
        System.out.println(hashString(s));
        
        scanner.close();
    }
}
