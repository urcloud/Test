import java.io.*;

public class Main {
        static long [] arr;
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    long n = Long.parseLong(br.readLine());

        if(n==0) {
            System.out.println("NO");
            return;
        }
        
        arr = new long[20];
        arr[0] = 1;
        
        for(int i=1;i<arr.length;i++){
            arr[i] = factorial(i);
            if(arr[i]>n) break;
        }

        for(int i=19;i>=0;i--){
            if(n>=arr[i] && arr[i]!=0){
                n-=arr[i];
            }
        }
        
        if(n==0){
            System.out.println("YES");
        }else
            System.out.println("NO");
	}

    public static long factorial(int n){
        if(n==1) return 1;
        return n*factorial(n-1);
    }
}