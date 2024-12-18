import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    //Scanner클래스틑 nextLine()을 통해 String을 받을 수 있지만 char을 직접 받지 않음
    //toCharArray() 메소드는 String 문자열에 포함된 모든 문자를 char 배열에 넣을 수 있음
    Scanner scanner = new Scanner(System.in);
    char[] str = scanner.nextLine().toCharArray();

    //아스키코드: 65~90(대문자), 97~122(소문자), 대소문자 차이는 32(97-65)
    for (int i = 0; i<str.length; ++i) {
      if(65<=str[i] && str[i]<=90) {
        str[i] = (char)(str[i]+32);
      }
      else if(97<=str[i] && str[i]<=122) {
        str[i] = (char)(str[i]-32);
      }
    }

    System.out.println(str);
    scanner.close();

  }
}