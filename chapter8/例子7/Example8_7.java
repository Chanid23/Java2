public class Example8_7 {
    public static void main(String args[]) {
       byte d[]="Java你好".getBytes(); 
       System.out.println("数组d的长度是:"+d.length);
       String hao=new String(d,6,2); //输出：好
       System.out.println(hao);
       String javaNi=new String(d,0,6);
       System.out.println(javaNi);   //输出：Java你
       String highByte=Integer.toBinaryString(d[7]);
       highByte = highByte.substring(highByte.length()-8);//只要后8位（bit）
       String lowByte=Integer.toBinaryString(d[6]);
       lowByte = lowByte.substring(lowByte.length()-8);//只要后8位（bit）
       System.out.println(hao+"的编码：");
       System.out.println(highByte+" "+lowByte);
    }
}


