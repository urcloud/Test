import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character s = scanner.nextLine().charAt(0);

        if(s=='N' || s=='n') {
            System.out.println("Naver D2");
        } else {
            System.out.println("Naver Whale");
        }

        scanner.close();
    }
}