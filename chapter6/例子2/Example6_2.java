interface  ShowMessage {
   void ��ʾ�̱�(String s);
   default void outPutStart(){
      System.out.println("********");
   }
}
class TV implements ShowMessage {
   public void ��ʾ�̱�(String s) {
       System.out.println("tvtvtvtv");
       System.out.println(s);
       System.out.println("tvtvtvtv");
   }
}
class PC implements ShowMessage {
   public void ��ʾ�̱�(String s) { 
       System.out.println("pcpcpcpc");
       System.out.println(s);
       System.out.println("pcpcpcpc");
   }
}
public class Example6_2 {
   public static void main(String args[]) {
       ShowMessage sm;                  //�����ӿڱ���
       sm=new TV();                     //�ӿڱ����д�Ŷ��������
       sm.��ʾ�̱�("�����Ƶ��ӻ�");      //�ӿڻص���
       sm=new PC();                     //�ӿڱ����д�Ŷ��������
       sm.outPutStart();
       sm.��ʾ�̱�("��Ϊ���˵���");    //�ӿڻص�
       sm.outPutStart();
   } 
}
