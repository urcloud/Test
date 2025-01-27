import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a0 = scanner.nextInt();
        int c = scanner.nextInt();
        int n0 = scanner.nextInt();
        
        //a1*n + a0 <= c*n
        //(c-a1)*n >=a0
        
        //c=a1이면 a0=0, c>a1일때만 n>n0 조건에서 O(n) 정의 만족할 가능성 있음
        
        if(c<a1) {
            System.out.println(0);
        } else {
            boolean isBigO = true;
            for (int n=n0; n<=100; n++) {
                if((c-a1)*n<a0) {
                    isBigO = false;
                    break;
                }
            }
            if (isBigO) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        
        scanner.close();
    }
}