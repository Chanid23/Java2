import java.util.*;
class Student implements Comparable<Student> { 
   int height=0;
   int weight;
   String name;
   Student(String n,int h,int w) {
      name=n;
      height = h;
      weight = w;
   }
   public int compareTo(Student st) { //����Student�����С��ϵ
      return (this.height-st.height);
   }
}
public class Example15_4 {
    public static void main(String args[ ]) { 
       List<Student> list = new LinkedList<Student>();
       list.add(new Student("����",188,86));
       list.add(new Student("����",178,83));
       list.add(new Student("�Դ���",198,89)); 
       list.add(new Student("������",175,80));
       Iterator<Student> iter=list.iterator();
       System.out.println("����ǰ,�����е�����:");
       while(iter.hasNext()){
          Student stu=iter.next();
          System.out.println(stu.name+ "���:"+stu.height);
       }
       Collections.sort(list);
       System.out.println("���򣨰���ߣ���,�����е�����:");
       iter=list.iterator();
       while(iter.hasNext()){
          Student stu=iter.next();
          System.out.println(stu.name+ "���:"+stu.height);
       }
       Student zhaoLin = new Student("zhao xiao lin",178,80);
       int index = Collections.binarySearch(list,zhaoLin,null);
       if(index>=0) {
          System.out.println(zhaoLin.name+
                           "��������"+list.get(index).name+"�����ͬ.");
       }
       Collections.sort(list,(a,b)->{ return a.weight-b.weight;
                                    });
       System.out.println("���򣨰����أ���,�����е�����:");
       iter=list.iterator();
       while(iter.hasNext()){
          Student stu=iter.next();
          System.out.println(stu.name+ "����:"+stu.weight);
       }
       index = Collections.binarySearch(list,zhaoLin,(a,b)->{ return a.weight-b.weight;
                                       });
       if(index>=0) {
          System.out.println(zhaoLin.name+
                            "��������"+list.get(index).name+"������ͬ.");
       }
    }
}

