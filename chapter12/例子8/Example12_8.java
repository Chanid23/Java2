public class Example12_8 {
   public static void main(String args[ ]) {
      TicketHouse officer = new TicketHouse();
      Thread zhangfei,likui;
      zhangfei = new Thread(officer); 
      zhangfei.setName("�ŷ�");
      likui = new Thread(officer);  
      likui.setName("����");
      zhangfei.start();
      try{
        Thread.sleep(1000);
      }
      catch(Exception exp){}
      likui.start();
   }
}
