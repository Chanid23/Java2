public class Example12_5 {
   public static void main(String args[]) {
      Target target = new Target();
      Thread thread = new Thread(target); 
      thread.setName("������ʾʱ��");  
      thread.start();
      thread = new Thread(target);
      thread.start();
   }
}
