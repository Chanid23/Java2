import java.util.Random;
import java.util.Arrays;
public class Example8_22 { 
   public static void main(String args[]) {
       int number = 7;
       int [] saveNumber = new int[number];
       for(int i = 0;i<saveNumber.length;i++){
           saveNumber[i] = i+1;//将1至number存放在数组saveNumber中
       }
       int [] frequency = new int[number];//存放数字出现的次数
       Random random = new Random();
       int counts = 10000;
       int i =1;
       while(i<=counts){
           int m = random.nextInt(number)+1;
           //判断m是否在数组saveNumber中(知识点见4.7.4)。
           int index = Arrays.binarySearch(saveNumber,m);
           if(index>=0)
                frequency[index]++;
           i++;
       }
       System.out.println("循环"+counts+"次");
       System.out.println(Arrays.toString(saveNumber));
       System.out.println("各个数字出现的次数：");
       System.out.println(Arrays.toString(frequency));
       int sum = 0;
       for(int item:frequency)
           sum +=item;
       System.out.println("次数之和sum = "+sum); 
   }
}