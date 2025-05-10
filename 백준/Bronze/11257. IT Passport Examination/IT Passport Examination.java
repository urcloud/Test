import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String id = sc.next();
            int strategy = sc.nextInt();
            int management = sc.nextInt();
            int technology = sc.nextInt();

            int total = strategy + management + technology;

            boolean strategyPass = strategy >= 0.3 * 35;
            boolean managementPass = management >= 0.3 * 25;
            boolean technologyPass = technology >= 0.3 * 40;

            boolean totalPass = total >= 55;
            boolean result = strategyPass && managementPass && technologyPass && totalPass;

            System.out.println(id + " " + total + " " + (result ? "PASS" : "FAIL"));
        }

        sc.close();
    }
}
