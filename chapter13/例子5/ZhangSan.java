import java.util.*;
public class ZhangSan  {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        SendDataPacket sendDataPacket=new SendDataPacket();  //���������ݰ�
        sendDataPacket.setIP("127.0.0.1");
        sendDataPacket.setPort(666);
        ReceiveDatagramPacket receiveDatagramPacket =
        new ReceiveDatagramPacket();  
        receiveDatagramPacket.setPort(888);                       
        receiveDatagramPacket.receiveMess();//����������ݰ�
        System.out.print("���뷢�͸����ĵ���Ϣ:");
        while(scanner.hasNext()) {
            String mess = scanner.nextLine();
            if(mess.length()==0) 
                 System.exit(0);
            byte buffer[] = mess.getBytes();
            sendDataPacket.sendMess(buffer);  
            System.out.print("�������뷢�͸����ĵ���Ϣ:");
        }
    }
}
