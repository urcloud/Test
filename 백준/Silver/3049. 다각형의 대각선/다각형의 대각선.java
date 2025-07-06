import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();

        int c = ((p)*(p-1)*(p-2)*(p-3))/24;
        System.out.println(c);
    }   
}