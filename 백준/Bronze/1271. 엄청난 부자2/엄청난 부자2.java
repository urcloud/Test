import java.util.Scanner;
import java.math.BigInteger;

// int의 범위는 '-2,147,483,648~2,147,483,647'이지만 BigInteger의 범위는 문자열 형태로 이루어져 있어 무한임

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        BigInteger n = scanner.nextBigInteger();
        BigInteger m = scanner.nextBigInteger();
        scanner.close();
        
        BigInteger coin = n.divide(m);
        BigInteger remain = n.remainder(m);
        
        System.out.println(coin);
        System.out.println(remain);
    }
}