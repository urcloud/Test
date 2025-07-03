import java.util.*;

public class Main {

    static int code1Cnt,  code2Cnt;

    static int[] f;
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

        int n =  Integer.parseInt(scanner.nextLine());
        f = new int[n];

        scanner.close();

        code1Cnt = 0;
        code2Cnt = 0;

        fib(n);
        fibonacci(n);

        System.out.println(code1Cnt + " " + code2Cnt);

    }

    static int fib(int n){
        if(n == 1 || n == 2){
            code1Cnt++;
            return 1;
        }
        else return (fib(n-1) + fib(n-2));
    }

    static int fibonacci(int n){
        f[0] = 1;
        f[1] = 1;

        for(int i = 2; i < n; i++){
            code2Cnt++;
            f[i] = f[i-1] + f[i-2];
        }
		
        return f[n-1];
    }
}