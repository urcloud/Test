import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int n=s.length();
        String[] res=new String[5];
        for(int i=0;i<5;i++)res[i]="";
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            boolean wendy=((i+1)%3==0);
            String[] frame=new String[5];
            if(wendy){
                frame[0]="..*..";
                frame[1]=".*.*.";
                frame[2]="*."+c+".*";
                frame[3]=".*.*.";
                frame[4]="..*..";
            }else{
                frame[0]="..#..";
                frame[1]=".#.#.";
                frame[2]="#."+c+".#";
                frame[3]=".#.#.";
                frame[4]="..#..";
            }
            for(int j=0;j<5;j++){
                if(i==0)res[j]=frame[j];
                else{
                    // 프레임 겹침 처리
                    // 이전 결과의 마지막 1글자와 새 프레임의 첫 2글자가 겹침
                    // 겹치는 위치는 항상 4번째 문자(인덱스 2)
                    // 웬디 프레임이 위에 오도록 처리
                    char overlapPrev=res[j].charAt(res[j].length()-1);
                    char overlapCurr=frame[j].charAt(0);
                    char toAdd=(overlapPrev=='*'||overlapCurr=='*')?'*':(overlapPrev=='#'||overlapCurr=='#')?'#':'.';
                    res[j]=res[j].substring(0,res[j].length()-1)+toAdd+frame[j].substring(1);
                }
            }
        }
        for(int i=0;i<5;i++)System.out.println(res[i]);
    }
}