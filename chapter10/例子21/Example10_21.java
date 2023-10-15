import java.io.*;
public class Example10_21 {
   public static void main(String args[]) {
      StandardExam exam = new StandardExam();
      File f = new File("test.txt");
      exam.setTestFile(f); 
      exam.startExamine();
   }
} 