import java.util.Date;
class Tom {
    void f(double m) {
        var width = 108;  //var��������width���ƶϳ���int��  
        var height = m; //var��������height���ƶϳ���double��
        var date = new Date();//var��������date���ƶϳ���Date�� 
        //width = 3.14; //�Ƿ�����Ϊwidth�������Ѿ�ȷ��Ϊint��
        //var str ; //�Ƿ����޷��ƶ�str������
       //var what = null; //�Ƿ����޷��ƶ�what������
       System.out.printf("%d,%f,%s\n",width,height,date); 
   }
}
public class Example4_21 {
    public static void main(String args[]){
         var tom = new Tom();//var��������tom���ƶϳ���Tom�� 
         tom.f(6.18);
    }
}
