import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //String 변수 st에 nextLine()으로 문자열 입력. 한 줄에 공백까지 포함해서 읽어옴
        //trim() 함수를 사용해 문자열 좌우에 있는 공백 제거
        String st = sc.nextLine().trim();
        
        //isEmpty() 함수로 문자열이 비어있으면 0출력
        if(st.isEmpty())
            System.out.println('0');
        //split() 함수로 문자열 나누기
        //기준을 (" ") 공백으로 잡아 나누고 length로 나눈 문자열 개수 출력
        else
            System.out.println(st.split(" ").length);
    }
}