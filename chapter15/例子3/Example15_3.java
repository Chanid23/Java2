import java.util.*;
public class Example15_3 {
   public static void main(String args[]){
      List<String> list=new LinkedList<String>();
      for(int i=0;i<=60096;i++){
             list.add("speed"+i);
      }
      Iterator<String> iter=list.iterator();
      long startTime = System.nanoTime();
      while(iter.hasNext()){
           String te=iter.next();
      }
      long estimatedTime = System.nanoTime() - startTime;
      System.out.println("迭代器所用时间:"+estimatedTime+"纳秒");
      startTime = System.nanoTime();
      for(int i=0;i<list.size();i++){
          String te=list.get(i);
      }
      estimatedTime = System.nanoTime() - startTime;
      System.out.println("get方法所用时间:"+estimatedTime+"纳秒");
    }
}
