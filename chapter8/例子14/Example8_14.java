import java.util.regex.*;
public class Example8_14 {
   public static void main(String args[ ]) { 
      String dataSource = "�л�76.8Ԫ,��;:167.38Ԫ,����12.68Ԫ,����:20Ԫ";//����Դ 
      String regex = "-?[1-9][0-9]*[.]?[0-9]*"; //ƥ�������͸�������������ʽ 
      Pattern p =Pattern.compile(regex);  //ģʽ����
      Matcher m =p.matcher(dataSource);   //ƥ�����
      double sum =0;
      while(m.find()) {
         String item = m.group();
         System.out.println(item);
         sum = sum+Double.parseDouble(item);
      } 
      System.out.println("�˵��ܼ۸�:"+sum);
   }
}
