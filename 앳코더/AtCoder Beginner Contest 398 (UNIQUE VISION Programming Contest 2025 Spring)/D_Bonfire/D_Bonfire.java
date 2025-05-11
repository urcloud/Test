import java.util.*;

public class D_Bonfire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int tFirst = sc.nextInt();
        int tSecond = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        
        int fFirst = 0, fSecond = 0;
        Set<String> st = new HashSet<>();
        st.add(fFirst + "," + fSecond);
        
        for (char nx : s.toCharArray()) {
            if (nx == 'N') {
                tFirst++;
                fFirst++;
            } else if (nx == 'W') {
                tSecond++;
                fSecond++;
            } else if (nx == 'S') {
                tFirst--;
                fFirst--;
            } else {
                tSecond--;
                fSecond--;
            }

            String f = fFirst + "," + fSecond;
            st.add(f);
            
            if (st.contains(tFirst + "," + tSecond)) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        
        System.out.println();
        sc.close();
    }
}