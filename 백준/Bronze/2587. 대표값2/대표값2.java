import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;
        
        for(int i=0; i<5; i++) {
            num[i] = scanner.nextInt();
            sum += num[i];
        }
        
        Arrays.sort(num);
        
        System.out.println(sum/5);
        System.out.println(num[2]);
        
        scanner.close();        
    }
}