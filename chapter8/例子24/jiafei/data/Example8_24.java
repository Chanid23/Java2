package jiafei.data;
import tom.data.Circle;
import java.lang.reflect.Constructor;
public class Example8_24 {
   public static void main(String args[]) {
      try{ 
           //Ҳ���� Class<?> cs = Circle.class; // ��ȱ�������
           Class<?> cs= Class.forName("tom.data.Circle"); 
          //���ز��������Ĺ��췽������װ��Constructor<?>������: 
           Constructor<?> structure = cs.getDeclaredConstructor();
           Circle circle =(Circle)structure.newInstance();//ʵ����Circle����
           circle.setRadius(100);
           double area = circle.getArea();
           String formatStr = String.format("%10.2f",area);
           System.out.println("circle�İ뾶:"+circle.radius);
           System.out.println("circle�����,����2λС��:\n"+area);
       }
       catch(Exception e) {
           System.out.println(e.getMessage());
       } 
   }  
}
