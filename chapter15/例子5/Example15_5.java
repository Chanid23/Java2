import java.util.*;
public class Example15_5 {
    public static void main(String args[ ]) { 
       List<Integer> list = new LinkedList<Integer>();
       for(int i=10;i<=50;i=i+10)
           list.add(i);
       System.out.println("ϴ��ǰ,�����е�����");
       Iterator<Integer> iter=list.iterator();
       while(iter.hasNext()){
          int n=iter.next();
          System.out.printf("%d\t",n);
       }
       System.out.printf("\n");
       Collections.shuffle(list);
       System.out.printf("\nϴ�ƺ�,�����е�����\n");
       iter=list.iterator();
       while(iter.hasNext()){
          int n=iter.next();
          System.out.printf("%d\t",n);
       }
       System.out.printf("\n");
       System.out.printf("\n������ת1�κ�,�����е�����\n");
       Collections.rotate(list,1);
       iter=list.iterator();
       while(iter.hasNext()){
          int n=iter.next();
          System.out.printf("%d\t",n);
       }
       System.out.printf("\n");
   }
}

