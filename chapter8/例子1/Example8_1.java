public class Example8_1 {
  public static void main(String args[]) {
       String hello = "���";
       String testOne = "��"+"��";             //������1��
       int address =System.identityHashCode("���");
       System.out.printf("\"���\"������:%x\n",address);
       address =System.identityHashCode(hello);
       System.out.printf("hello������:%x\n",address);
       address =System.identityHashCode(testOne);
       System.out.printf("testOne������:%x\n",address);
       System.out.println(hello == testOne);   //��������true
       System.out.println("���" == testOne);  //��������true
       System.out.println("���" == hello);    //��������true
       String you = "��";
       String hi = "��";
       String testTwo = you+hi;                //������2��
       address =System.identityHashCode("��");
       System.out.printf("\"��\"������:%x\n",address);
       address =System.identityHashCode("��");
       System.out.printf("\"��\"������:%x\n",address);
       address =System.identityHashCode(testTwo);
       System.out.printf("testTwo������:%x\n",address);
       System.out.println(hello == testTwo);   //��������false
    }
}
