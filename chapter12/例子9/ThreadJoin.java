public class ThreadJoin implements Runnable {
   Cake cake;
   Thread customer,cakeMaker;
   public void setThread(Thread ...t) {
      customer=t[0];
      cakeMaker=t[1]; 
   }
   public void run() {
      if(Thread.currentThread()==customer) {
          System.out.println(customer.getName()+"�ȴ�"+
                             cakeMaker.getName()+"�������յ���");
          try{  cakeMaker.start();
                cakeMaker.join();     //��ǰ�߳̿�ʼ�ȴ�cakeMaker����
          } 
          catch(InterruptedException e){}
          System.out.println(customer.getName()+
                         "����"+cake.name+" ��Ǯ:"+cake.price);
      }
      else if(Thread.currentThread()==cakeMaker) {
          System.out.println(cakeMaker.getName()+"��ʼ�������յ���,���...");
          try { Thread.sleep(2000);    
          }
          catch(InterruptedException e){}
          cake=new Cake("���յ���",158) ;
          System.out.println(cakeMaker.getName()+"�������");
      }
   }   
   class Cake {  //�ڲ���
     int price;
     String name;
     Cake(String name,int price) {
       this.name=name;
       this.price=price;
     } 
   }
}
