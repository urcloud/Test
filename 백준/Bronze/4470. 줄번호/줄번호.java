import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<N; i++) {
            String str = scanner.nextLine();
            System.out.println((i+1)+". "+str);
        }
		scanner.close();
    }
}