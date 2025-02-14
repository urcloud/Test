import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.nextLine();
        
        if(str.equals("M")) {
            System.out.println("MatKor");
        } else if (str.equals("W")) {
            System.out.println("WiCys");
        } else if (str.equals("C")) {
            System.out.println("CyKor");
        } else if (str.equals("A")) {
            System.out.println("AlKor");
        } else if (str.equals("$")) {
            System.out.println("$clear");
        }
        
        scanner.close();
    }
}