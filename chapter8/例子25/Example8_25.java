import java.util.Arrays;
import java.util.Random;
public class Example8_25 {
   public static void main(String args[]) {
       Random randomOne = new Random(2022);
       Random randomTwo = new Random(2022);//���߾�����ͬ���������
       int amount = 10000;
       int [] one = new int[amount];
       int [] two = new int[amount];
       for(int i = 0;i<amount;i++){
          one[i] = randomOne.nextInt(amount);
          two[i] = randomTwo.nextInt(amount);
       }
       if(Arrays.equals(one,two)){
          System.out.println("����������ȣ�ǰ8��Ԫ�طֱ���:");
          int [] a = Arrays.copyOf(one,8);
          int [] b = Arrays.copyOf(two,8);
          System.out.println(Arrays.toString(a)); 
          System.out.println(Arrays.toString(b)); 
       }
       else {
          System.out.println("�������鲻���"); 
       }
       long startTime = System.nanoTime();
       Arrays.sort(one);  //��ʼ����
       Arrays.sort(two);
       long elapsedNanos = System.nanoTime() - startTime; 
       System.out.println("���������������ʱ�����룩"+elapsedNanos);
       
    }
}