import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int basket[] = new int[N];
    int temp;
    
    for(int i=0; i<basket.length; i++){
      basket[i] = i+1;
    }

    for(int i=0; i<M; i++) {
      int x = scanner.nextInt()-1;
      int y = scanner.nextInt()-1;

      while (x<y) {
        temp=basket[x];
        basket[x]=basket[y];
        basket[y]=temp;
        x++;
        y--;
      }
    }

    for(int i=0; i<basket.length; i++) {
      System.out.println(basket[i]);
    }
    
    scanner.close();
  }
}