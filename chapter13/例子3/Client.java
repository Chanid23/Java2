import java.io.*;
import java.net.*;
public class Client {
   public static void main(String args[]) {
      String [] mess ={"���������ĸ߶��Ƕ��٣�","�����ж��ٸ�����?","�������ĸ�ʡ��ʡ�᣿"};
      Socket mysocket;
      DataInputStream in=null;
      DataOutputStream out=null;
      try{  mysocket=new Socket("127.0.0.1",2010);
            in=new DataInputStream(mysocket.getInputStream());
            out=new DataOutputStream(mysocket.getOutputStream()); 
            for(int i=0;i<mess.length;i++) {
              out.writeUTF(mess[i]);
              String  s=in.readUTF();   //in��ȡ��Ϣ������״̬
              System.out.println("�ͻ��յ��������Ļش�:"+s);
              Thread.sleep(1000);
            } 
       }
       catch(Exception e) {
            System.out.println("�������ѶϿ�"+e);
       }
   } 
}
