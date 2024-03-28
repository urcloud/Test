import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //input
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt(); //배열 A의 사이즈
    int M = scanner.nextInt(); //배열 B의 사이즈

    List<Integer> A = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      int n = scanner.nextInt();
      A.add(n);
    }

    List<Integer> B = new ArrayList<>();
    for (int i = 0; i < M; i++) {
      int m = scanner.nextInt();
      B.add(m);
    }

    //logic
    List<Integer> result = new ArrayList<>();
    int i = 0, j = 0; //배열 A의 인덱스, 배열 B의 인덱스
    while (i < N && j < M) {
      int a = A.get(i);
      int b = B.get(j);

      if (a <= b) {
        result.add(a);
        i++;
      } else {
        result.add(b);
        j++;
      }
    }
    for (; i < N; i++) {
      result.add(A.get(i));
    }
    for (; j < M; j++) {
      result.add(B.get(j));
    }

    //output
    StringBuilder sb = new StringBuilder();
    for (int e : result) {
      sb.append(e + " ");
    }
    System.out.println(sb.toString());
  }
    //A.forEach(e-> System.out.println(e + " "));
    //B.forEach(e-> System.out.println(e + " "));
}