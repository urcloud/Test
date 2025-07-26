import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] num1 = new int[6];
        int[] num2 = new int[6];
        int room = 0;

        for(int i=0; i<n; i++) {
            int s = scanner.nextInt();
            int y = scanner.nextInt();

            if(s==1) {
                num1[y-1] += 1;
            } else {
                num2[y-1] += 1;
            }
        }

        for(int i=0; i<6; i++) {
            if(num1[i] != 0) {
                if(num1[i]<=k) {
                    room += 1;
                } else {
                    if(num1[i]%k==0) {
                        room += num1[i]/k;
                    } else {
                        room += (num1[i]/k)+1;
                    }
                }
            }
        }

        for(int i=0; i<6; i++) {
            if(num2[i] != 0) {
                if(num2[i]<=k) {
                    room += 1;
                } else {
                    if(num2[i]%k==0) {
                        room += num2[i]/k;
                    } else {
                        room += (num2[i]/k)+1;
                    }
                }
            }
        }

        System.out.println(room);
        scanner.close();
    }
}