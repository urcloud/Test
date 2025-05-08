import java.util.Scanner;

public class B_Sum_of_Geometric_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long result = 0;

        for(int i=0; i<=M; i++) {
            result += Math.pow(N, i);
        }

        if(result>Math.pow(10, 9)) {
            System.out.println("inf");
        } else {
            System.out.println(result);
        }
        
        scanner.close();
    }
}