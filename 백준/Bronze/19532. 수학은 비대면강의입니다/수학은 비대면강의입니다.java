import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        for(int i = -999; i <= 999; i++) {
            for(int j = -999; j <= 999; j++) {
                if(a*i + b*j  == c){
                    if(d*i + e*j  == f) {
                        System.out.println(i);
                        System.out.println(j);
                    }
                }
            }
        }
        scanner.close();
    }
}