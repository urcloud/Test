import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int[] num = new int[i];

        for(int a=0; a<j; a++) {
            for(int b=0; b<i; b++) {
                num[b] += scanner.nextInt();
            }
        }

        int max = 0;
        int n = 0;
        for(int c=0; c<i; c++) {
            if(num[c] >= max){
                max = Math.max(max, num[c]);
                n = c;
            }
        }

        System.out.println(n+1);
        scanner.close();
    }
}