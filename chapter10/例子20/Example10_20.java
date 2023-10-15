import java.io.*;
public class Example10_20{
   public static void main(String args[]) {
      File file=new File("Example10_17.java");
      WindowFileLock win=new WindowFileLock(file);
      win.setTitle("使用文件锁");
   }
}
