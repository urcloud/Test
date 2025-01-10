import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        
        BigInteger a = new BigInteger(split[0]);
        BigInteger b = new BigInteger(split[1]);

        System.out.println(a.add(b));
    }
}