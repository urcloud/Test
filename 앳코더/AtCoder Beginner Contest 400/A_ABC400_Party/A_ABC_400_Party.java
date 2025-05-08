import java.util.Scanner;

public class A_ABC_400_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();

        if(400 % A == 0) {
            int B = (int) 400/A;
            System.out.println(B);
        } else {
            System.out.println(-1);
        }

        scanner.close();
    }
}