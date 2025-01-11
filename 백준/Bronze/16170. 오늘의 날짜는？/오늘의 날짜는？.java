import java.util.Calendar;

public class Main {
  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    System.out.println(c.get(c.YEAR));
    System.out.println(c.get(c.MONTH)+1);
    System.out.println(c.get(c.DATE));
  }
}