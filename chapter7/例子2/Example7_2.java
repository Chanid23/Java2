public class Example7_2 {
    public static void main(String args[]) {
        ShowBank showBank = new ShowBank();
        showBank.showMess(new Bank() { //���������Bank�������������
                          public void output() {
                             money+=100;
                             System.out.printf("�й������ʽ�%3d\n",money); 
                          }  
                       }
                     );
        showBank.showMess(new Bank(500) { //���������Bank�������������
                          public void output() {
                             money+=100;
                             System.out.printf("���������ʽ�%3d\n",money); 
                          }  
                       }
                     );
   } 
}


