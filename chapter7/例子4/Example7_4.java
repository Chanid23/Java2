interface SpeakHello {
     void speak();
}
class  HelloMachine {
   public void turnOn(SpeakHello hello) {
       hello.speak();
   }
}
public class Example7_4 {
   public static void main(String args[]) {
      HelloMachine machine = new HelloMachine();
      machine.turnOn( ()->{        //���βδ���Lambada���ʽ��ֵ��
                           System.out.println("hello,you are welcome!");
                      }); 
      machine.turnOn( ()->{       //���βδ���Lambada���ʽ��ֵ��
                           System.out.println("��ã���ӭ����!");
                      }); 
   } 
}
