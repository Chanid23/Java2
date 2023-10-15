import java.net.*;
import java.io.*;
import java.util.*;
public class Example13_1 {
   public static void main(String args[]) {
       Scanner scanner;
       URL url;
       Thread readURL;
       Look look = new Look();
       System.out.println(" ‰»ÎURL◊ ‘¥£∫");
       scanner = new Scanner(System.in);
       String source = scanner.nextLine();
       try {  url = new URL(source);
              look.setURL(url);
              readURL = new Thread(look);
              readURL.start();
       }
       catch(Exception exp){
          System.out.println(exp);
       } 
   }
}

