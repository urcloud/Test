import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        while(scanner.hasNextLine()) {
            scanner.nextLine();
            count++;
        }
        
        System.out.println(count);
        scanner.close();
    }
}