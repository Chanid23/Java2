import java.util.*;
public class Example15_5 {
    public static void main(String args[ ]) { 
       List<Integer> list = new LinkedList<Integer>();
       for(int i=10;i<=50;i=i+10)
           list.add(i);
       System.out.println("洗牌前,链表中的数据");
       Iterator<Integer> iter=list.iterator();
       while(iter.hasNext()){
          int n=iter.next();
          System.out.printf("%d\t",n);
       }
       System.out.printf("\n");
       Collections.shuffle(list);
       System.out.printf("\n洗牌后,链表中的数据\n");
       iter=list.iterator();
       while(iter.hasNext()){
          int n=iter.next();
          System.out.printf("%d\t",n);
       }
       System.out.printf("\n");
       System.out.printf("\n向右旋转1次后,链表中的数据\n");
       Collections.rotate(list,1);
       iter=list.iterator();
       while(iter.hasNext()){
          int n=iter.next();
          System.out.printf("%d\t",n);
       }
       System.out.printf("\n");
   }
}

