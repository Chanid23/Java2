import javax.swing.*;
public class WindowMenu extends JFrame {
    JMenuBar menubar;
    JMenu menuFruit;
    JMenuItem bananaItem,pearItem;
    JMenu appleMenu;
    JMenuItem redAppleItem,yellowAppleItem;
    public WindowMenu(){} 
    public WindowMenu(String s,int x,int y,int w,int h) {
       init(s);
       setLocation(x,y);
       setSize(w,h);
       setVisible(true);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
    }
    void init(String s){
       setTitle(s);             //���ô��ڵı���   
       menubar=new JMenuBar(); 
       menuFruit=new JMenu("ˮ���˵�"); //menuFruit�����˵� 
       bananaItem=new JMenuItem("�㽶"); 
       bananaItem.setIcon(new ImageIcon("banana.jpg"));
       pearItem=new JMenuItem("����");
       pearItem.setIcon(new ImageIcon("pear.jpg"));
       appleMenu=new JMenu("ƻ��"); 
       redAppleItem = new JMenuItem("��ƻ��");
       redAppleItem.setIcon(new ImageIcon("redApple.jpg")); 
       yellowAppleItem = new JMenuItem("��ƻ��"); 
       yellowAppleItem.setIcon(new ImageIcon("yellowApple.png"));
       menuFruit.add(bananaItem); //�˵���Ӳ˵��� 
       menuFruit.add(pearItem);   //�˵���Ӳ˵���
       menuFruit.addSeparator();  //�ڲ˵���ӷָ���
       menuFruit.add(appleMenu);  //�˵�Ҳ������Ӳ˵�
       appleMenu.add(redAppleItem);  //�˵���Ӳ˵���
       appleMenu.add(yellowAppleItem);  //�˵���Ӳ˵���
       menubar.add(menuFruit); //�˵������menuFruit�˵�
       setJMenuBar(menubar);   //���ڷ��ò˵���
    } 
}
