import java.time.*;
public class Example8_16 {
   public static void main(String args[ ]) {
       LocalDate dateOne = LocalDate.now();
       System.out.println("��������:"+dateOne);
       LocalDate dateTwo = LocalDate.of(2025,1,22);
       System.out.println("�Զ�����:"+dateTwo);
       System.out.println(dateOne+"��"+dateTwo+"֮��:"+
                          dateOne.isAfter(dateTwo));
       System.out.println(dateOne+"��"+dateTwo+"֮ǰ:"+
                          dateOne.isBefore(dateTwo));
       System.out.println(dateOne+"��"+dateTwo+"��ͬ:"+
                          dateOne.isEqual(dateTwo));
       int year = 18,month = 23,day = 8976;
       LocalDate dateAgo=  dateOne.plusYears(-year);
       System.out.println(dateOne+" "+ year+"��ǰ��:\n"+dateAgo);
       System.out.println("������"+dateAgo.getDayOfWeek());
       LocalDate dateAfter =  
       dateTwo.plusYears(year).plusMonths(month).plusDays(8976);
       System.out.println
      (dateTwo+"�ٹ�"+year+"��"+month+"����"+day+"��֮����:");
       System.out.println(dateAfter);
       System.out.println("������"+dateAfter.getDayOfWeek());
       int second = 1897;
       LocalTime time = LocalTime.of(23,30,1);
       LocalTime nextTime = time.plusSeconds(second);
       System.out.println(time+"�ٹ�"+second+"����:"+nextTime);
   }
}
