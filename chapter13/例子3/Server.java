import java.io.*;
import java.net.*;
public class Server {
   public static void main(String args[]) {
      String [] answer ={"����ʯ�溣��8844.43��","48��","�ຣʡ"};
      ServerSocket serverForClient=null;
      Socket socketOnServer=null;
      DataOutputStream out=null;
      DataInputStream  in=null;
      try { serverForClient = new ServerSocket(2010);
      }
      catch(IOException e1) {
          //����˿ں��Ѿ���ռ�ã��������쳣
            System.out.println(e1);
      } 
      try{ System.out.println("�ȴ��ͻ�����");
           socketOnServer = serverForClient.accept(); //����״̬�������пͻ�����
           System.out.println("�ͻ��ĵ�ַ:"+socketOnServer.getInetAddress());
           System.out.println("�ͻ��Ķ˿�:"+socketOnServer.getPort());
           out=new DataOutputStream(socketOnServer.getOutputStream());
           in=new DataInputStream(socketOnServer.getInputStream());
           for(int i=0;i<answer.length;i++) {
              String s=in.readUTF(); // in��ȡ��Ϣ������״̬
              System.out.println("�������յ��ͻ�������:"+s);
              out.writeUTF(answer[i]);
              Thread.sleep(1000);
           }
      }
      catch(Exception e) {
          System.out.println("�ͻ��ѶϿ�"+e);
      }
   }
}
