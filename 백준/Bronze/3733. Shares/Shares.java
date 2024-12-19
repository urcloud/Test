import java.util.Scanner;

//N명으로 구성된 그룹과 심판 한 명은 S주를 동등하게 나눠 가짐, S/(N+1)
//입력은 파일의 끝(EOF)을 검사하여 더이상 받을 수 있는 데이터가 없을 때 종료
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(sc.hasNextInt()) {
      int n = sc.nextInt();
      int s = sc.nextInt();
      System.out.println(s / (n + 1));
    }
  }
}