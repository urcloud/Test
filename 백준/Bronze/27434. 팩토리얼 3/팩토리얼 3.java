import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.valueOf(br.readLine());

        System.out.println(factorial(1, N));
    }

    public static BigInteger factorial(int a, int n){
        BigInteger num = BigInteger.valueOf(a);

        // a가 n보다 작으면
        if (a < n){
            // a와 n의 중간값을 b에 할당
            int b = (a + n) / 2;
            // (재귀함수 사용) a부터 b까지 계산 후 b+1 부터 n까지 계산
            // 그냥 a부터 n까지 재귀로 계산한다고 생각
            num = factorial(a,b).multiply(factorial(b+1, n));
        }
        
        return num;
    }
}