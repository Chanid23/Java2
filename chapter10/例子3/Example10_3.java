import java.io.*;
public class Example10_3 {
   public static void main(String args[]) {
      try{ 
           Runtime ce=Runtime.getRuntime();
           File file=new File("Notepad.exe");
           ce.exec(file.getName());
           file=new File
           ("C:/Program Files/Microsoft Office/root/Office16/Excel.exe");
           ce.exec(file.getAbsolutePath());
      }
      catch(Exception e) {
         System.out.println(e);
      } 
   } 
}

