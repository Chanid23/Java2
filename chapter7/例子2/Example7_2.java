public class Example7_2 {
    public static void main(String args[]) {
        ShowBank showBank = new ShowBank();
        showBank.showMess(new Bank() { //向参数传递Bank的匿名子类对象
                          public void output() {
                             money+=100;
                             System.out.printf("中国银行资金：%3d\n",money); 
                          }  
                       }
                     );
        showBank.showMess(new Bank(500) { //向参数传递Bank的匿名子类对象
                          public void output() {
                             money+=100;
                             System.out.printf("建设银行资金：%3d\n",money); 
                          }  
                       }
                     );
   } 
}


