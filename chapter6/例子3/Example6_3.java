interface  ShowMessage {
   void ��ʾ�̱�(String s);
}
public class Example6_3 {
   public static void main(String args[]) {
       ShowMessage sm;   //�����ӿڱ�����
       sm=(s)->{         //�ӿڱ����д��Lambada���ʽ��ֵ��
           System.out.println("tvtvtvtv");
           System.out.println(s);
           System.out.println("tvtvtvtv");  
       };
       sm.��ʾ�̱�("�����Ƶ��ӻ�"); //�ӿڻص�Lambada���ʽʵ�ֵĽӿڷ�����
       sm=(s)->{         //�ӿڱ����д��Lambada���ʽ��ֵ
           System.out.println("pcpcpcpc");
           System.out.println(s);
           System.out.println("pcpcpcpc");  
       };
       sm.��ʾ�̱�("��Ϊ���˵���"); //�ӿڻص�Lambada���ʽʵ�ֵĽӿڷ�����
   } 
}
