import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] semi = new String[N];

        for(int i=0; i<N; i++) {
            semi[i] = scanner.next();
        }

        for(int i=0; i<N; i++) {
            if(semi[i].equals("Algorithm")) {
                System.out.println(204);
            } else if(semi[i].equals("DataAnalysis")) {
                System.out.println(207);
            } else if(semi[i].equals("ArtificialIntelligence")) {
                System.out.println(302);
            } else if(semi[i].equals("CyberSecurity")) {
                System.out.println("B101");
            } else if(semi[i].equals("Network")) {
                System.out.println(303);
            } else if(semi[i].equals("Startup")) {
                System.out.println(501);
            } else if(semi[i].equals("TestStrategy")) {
                System.out.println(105);
            }
        }

        scanner.close();
    }
}