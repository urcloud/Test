import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if(620<=N && N<=780) {
            System.out.println("Red");
        } else if(590<=N && N<=620) {
            System.out.println("Orange");
        } else if(570<=N && N<=590) {
            System.out.println("Yellow");
        } else if(495<=N && N<=570) {
            System.out.println("Green");
        } else if(450<=N && N<=495) {
            System.out.println("Blue");
        } else if(425<=N && N<=450) {
            System.out.println("Indigo");
        } else if(380<=N && N<=425) {
            System.out.println("Violet");
        }

        scanner.close();
    }
}