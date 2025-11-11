import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[3];
        int[] num2 = new int[3];

        for(int i=0; i<3; i++) {
            num[i] = scanner.nextInt();
        }

        for(int j=0; j<3; j++) {
            num2[j] = scanner.nextInt();
        }

        int answer = 0;
        for(int k=0; k<3; k++) {
            if(num[k] < num2[k]) {
                answer += (num2[k]-num[k]);
            }
        }

        System.out.println(answer);
        scanner.close();
    }
}