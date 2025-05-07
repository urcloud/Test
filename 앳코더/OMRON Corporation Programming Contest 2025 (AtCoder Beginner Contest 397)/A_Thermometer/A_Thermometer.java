import java.util.Scanner;

public class A_Thermometer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double X = scanner.nextDouble();
        
        if(X>=38.0) {
            System.out.println(1);
        } else if (37.5<=X && X<38.0) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }

        scanner.close();
    }
}