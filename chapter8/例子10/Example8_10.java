public class Example8_10 {
   public static void main (String args[ ]) {
      String str = "��ѵѧУ��email:qinghua@sina.com.cn��zhang@163.com";
      String regex = "\\w+@\\w+\\.[a-z]+(\\.[a-z]+)?";
      System.out.println("���\n"+str+"\n�е�email��ַ");
      str = str.replaceAll(regex,"");
      System.out.println(str);
      String money = "89,235,678��";
      System.out.print(money+"ת��������:"); 
      String s = money.replaceAll("[,\\p{Sc}]","") ; //\\p{Sc}ƥ���κλ��ҷ���
      long  number = Long.parseLong(s);
      System.out.println(number); 
   }
}

