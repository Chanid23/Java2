package demo;
import java.util.Scanner;
public class P26_3 {
	
    public static void main (String args[ ]){
		// TODO Auto-generated method stub    	
        System.out.println("用空格或回车做分隔，输入若干个数\n"+
                           "最后输入数字0,回车结束输入操作");
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



