import java.util.*;
public class LiSi  {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        SendDataPacket sendDataPacket=new SendDataPacket();  //���������ݰ�
        sendDataPacket.setIP("127.0.0.1");
        sendDataPacket.setPort(888);
        ReceiveDatagramPacket receiveDatagramPacket =
        new ReceiveDatagramPacket();  
        receiveDatagramPacket.setPort(666);                       
        receiveDatagramPacket.receiveMess();//����������ݰ�
        System.out.print("���뷢�͸���������Ϣ:");
        while(scanner.hasNext()) {
            String mess = scanner.nextLine();
            if(mess.length()==0) 
                 System.exit(0);
            byte buffer[] = mess.getBytes();
            sendDataPacket.sendMess(buffer);  
            System.out.print("�������뷢�͸���������Ϣ:");
        }
    }
}
