package demo;
import java.util.Scanner;
public class P26_3 {
	
    public static void main (String args[ ]){
		// TODO Auto-generated method stub    	
        System.out.println("�ÿո��س����ָ����������ɸ���\n"+
                           "�����������0,�س������������");
        Scanner reader=new Scanner(System.in);
        double sum=0;
        double x = reader.nextDouble();
        while(x!=0){
           sum=sum+x;
           x=reader.nextDouble();
        }
        System.out.printf("sum=%10.5f\n",sum);
    }
}



