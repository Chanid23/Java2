import java.time.*;
public class Example15_1 {
   public static void main(String args[]) {
       //������Eָ��ΪLocalTime
       People<LocalTime> zhang=new People<LocalTime>();
       zhang.setFriend(LocalTime.now());
       LocalTime zhangFriend = zhang.getFriend();
       System.out.println(zhangFriend);
       People<Double> geng = new People<Double>() ;
       geng.setFriend(1.618);
       double gengFriend = geng.getFriend();
       System.out.println(gengFriend); 
  }
}

