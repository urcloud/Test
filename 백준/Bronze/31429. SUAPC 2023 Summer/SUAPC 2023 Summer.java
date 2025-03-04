import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if(N==1) {
            System.out.println("12 1600");
        }else if(N==2) {
            System.out.println("11 894");
        }else if(N==3) {
            System.out.println("11 1327");
        }else if(N==4) {
            System.out.println("10 1311");
        }else if(N==5) {
            System.out.println("9 1004");
        }else if(N==6) {
            System.out.println("9 1178");
        }else if(N==7) {
            System.out.println("9 1357");
        }else if(N==8) {
            System.out.println("8 837");
        }else if(N==9) {
            System.out.println("7 1055");
        }else if(N==10) {
            System.out.println("6 556");
        }else if(N==11) {
            System.out.println("6 773");
        }

        scanner.close();
    }
}