import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            double a = scanner.nextDouble();
            if (a==-1) {
                break;
            }

            double b = a*0.167;
            String c = String.format("%.2f", a);
            String d = String.format("%.2f", b);
            System.out.println("Objects weighing "+c+" on Earth will weigh "+d+" on the moon.");
        }
        scanner.close();
    }
}
