import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] L = new int[3];

    for(int i=0; i<3; i++) {
      L[i] = scanner.nextInt();
    }

    Arrays.sort(L);

    if(L[2]<(L[0]+L[1])) {
      System.out.println(L[0]+L[1]+L[2]);
    } else {
      int max = (L[2] - (L[0]+L[1])) + 1;
      System.out.println(L[0]+L[1]+L[2]-max);
    }
    scanner.close();
  }
}