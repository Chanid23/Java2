public class Example8_7 {
    public static void main(String args[]) {
       byte d[]="Java���".getBytes(); 
       System.out.println("����d�ĳ�����:"+d.length);
       String hao=new String(d,6,2); //�������
       System.out.println(hao);
       String javaNi=new String(d,0,6);
       System.out.println(javaNi);   //�����Java��
       String highByte=Integer.toBinaryString(d[7]);
       highByte = highByte.substring(highByte.length()-8);//ֻҪ��8λ��bit��
       String lowByte=Integer.toBinaryString(d[6]);
       lowByte = lowByte.substring(lowByte.length()-8);//ֻҪ��8λ��bit��
       System.out.println(hao+"�ı��룺");
       System.out.println(highByte+" "+lowByte);
    }
}


