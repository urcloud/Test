import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    int price;
    int max;


    //모든 변수가 다름
    if (A>B) {
      if (C>A) {
        max = C;
      } else {
        max = A;
      }
    } else {
      if (C>B) {
        max = C;
      } else {
        max = B;
      }
    }

    //3개 같은 변수
    if (A==B && B==C) {
      price = 10000+(A*1000);
      
      //2개 같은 변수
    } else if (A==B || A==C) {
      price = 1000+(A*100);
    } else if (B==C && C!=A){
      price = 1000+(B*100);
      
      //1개 같은 변수
    } else {
      price = max * 100;
    }

    System.out.println(price);

    scanner.close();
  }
}