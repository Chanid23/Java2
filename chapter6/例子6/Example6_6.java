interface SpeakHello {
    void speakHello();
}
class Chinese implements SpeakHello {
   public  void speakHello() {
       System.out.println("�й���ϰ���ʺ�����,�Է�����? ");
   }
}
class English implements SpeakHello {
    public  void speakHello() {
       System.out.println("Ӣ����ϰ���ʺ���:���,�������� ");
    }
}
class KindHello {
   public void lookHello(SpeakHello hello) { //�ӿ����Ͳ���
       hello.speakHello();                    //�ӿڻص�
   }
}
public class Example6_6 {
   public static void main(String args[]) {
       KindHello a = new KindHello();  
       Chinese  ccc  = new Chinese();
       a.lookHello(ccc );
       a.lookHello(new English());
       a.lookHello( ()->{
       System.out.println("��ũϰ���ʺ��no bug");} );//���������Lambda���ʽ��ֵ       
   }
}
