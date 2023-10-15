package jiafei.data;
import tom.data.Circle;
import java.lang.reflect.Constructor;
public class Example8_24 {
   public static void main(String args[]) {
      try{ 
           //也可以 Class<?> cs = Circle.class; // 但缺乏灵活性
           Class<?> cs= Class.forName("tom.data.Circle"); 
          //返回不带参数的构造方法，封装在Constructor<?>对象中: 
           Constructor<?> structure = cs.getDeclaredConstructor();
           Circle circle =(Circle)structure.newInstance();//实例化Circle对象
           circle.setRadius(100);
           double area = circle.getArea();
           String formatStr = String.format("%10.2f",area);
           System.out.println("circle的半径:"+circle.radius);
           System.out.println("circle的面积,保留2位小数:\n"+area);
       }
       catch(Exception e) {
           System.out.println(e.getMessage());
       } 
   }  
}
