public class Example8_10 {
   public static void main (String args[ ]) {
      String str = "培训学校的email:qinghua@sina.com.cn或zhang@163.com";
      String regex = "\\w+@\\w+\\.[a-z]+(\\.[a-z]+)?";
      System.out.println("清除\n"+str+"\n中的email地址");
      str = str.replaceAll(regex,"");
      System.out.println(str);
      String money = "89,235,678￥";
      System.out.print(money+"转化成数字:"); 
      String s = money.replaceAll("[,\\p{Sc}]","") ; //\\p{Sc}匹配任何货币符号
      long  number = Long.parseLong(s);
      System.out.println(number); 
   }
}

