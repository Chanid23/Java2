import java.time.*;
import java.util.Locale;
public class Example8_19 {
   public static void main(String args[]) {
      LocalDateTime nowTime = LocalDateTime.now();
      String pattern = "%tY-%<tm-%<td,%<tA,%<tT";
      String s = String.format(pattern,nowTime);
      System.out.println(s);
      s = String.format(Locale.US,pattern,nowTime);
      System.out.println(s);
      s = String.format(Locale.JAPAN,pattern,nowTime);
      System.out.println(s);
    }
}
