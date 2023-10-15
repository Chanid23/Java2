import java.net.*; 
public class Example13_2 {
   public static void main(String args[]) {
      try{  InetAddress address=InetAddress.getByName("www.sina.com.cn");
            System.out.println(address.toString()); 
            address=InetAddress.getByName("221.180.220.34");
            System.out.println(address.toString());
            address=InetAddress.getLocalHost();
            System.out.println(address.toString());
      }
      catch(UnknownHostException e) {
           System.out.println(""+e);
      } 
   }
}


