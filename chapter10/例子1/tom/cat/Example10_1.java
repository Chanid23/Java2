package tom.cat;
import java.io.*;
public class Example10_1 {
   public static void main(String args[]) {
      File f = new File("tom\\cat","Example10_1.java");
      System.out.println(f.getName()+"�ǿɶ�����:\n"+f.canRead());
      System.out.println(f.getName()+"�ĳ���:\n"+f.length());
      System.out.println(f.getName()+"�ľ���·��:\n"+f.getAbsolutePath());
      File file = new File("new.txt");
      if(!file.exists()) {
         try {
              file.createNewFile();
              System.out.println
             ("�ڵ�ǰĿ¼(���г����Ŀ¼)�´��������ļ�:\n"+file.getName());
         }
         catch(IOException exp){}
      }
   }
}
