import java.util.Random;
import java.util.Arrays;
public class Example8_22 { 
   public static void main(String args[]) {
       int number = 7;
       int [] saveNumber = new int[number];
       for(int i = 0;i<saveNumber.length;i++){
           saveNumber[i] = i+1;//��1��number���������saveNumber��
       }
       int [] frequency = new int[number];//������ֳ��ֵĴ���
       Random random = new Random();
       int counts = 10000;
       int i =1;
       while(i<=counts){
           int m = random.nextInt(number)+1;
           //�ж�m�Ƿ�������saveNumber��(֪ʶ���4.7.4)��
           int index = Arrays.binarySearch(saveNumber,m);
           if(index>=0)
                frequency[index]++;
           i++;
       }
       System.out.println("ѭ��"+counts+"��");
       System.out.println(Arrays.toString(saveNumber));
       System.out.println("�������ֳ��ֵĴ�����");
       System.out.println(Arrays.toString(frequency));
       int sum = 0;
       for(int item:frequency)
           sum +=item;
       System.out.println("����֮��sum = "+sum); 
   }
}