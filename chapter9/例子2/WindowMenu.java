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
       setTitle(s);             //设置窗口的标题   
       menubar=new JMenuBar(); 
       menuFruit=new JMenu("水果菜单"); //menuFruit做根菜单 
       bananaItem=new JMenuItem("香蕉"); 
       bananaItem.setIcon(new ImageIcon("banana.jpg"));
       pearItem=new JMenuItem("甜梨");
       pearItem.setIcon(new ImageIcon("pear.jpg"));
       appleMenu=new JMenu("苹果"); 
       redAppleItem = new JMenuItem("红苹果");
       redAppleItem.setIcon(new ImageIcon("redApple.jpg")); 
       yellowAppleItem = new JMenuItem("黄苹果"); 
       yellowAppleItem.setIcon(new ImageIcon("yellowApple.png"));
       menuFruit.add(bananaItem); //菜单添加菜单项 
       menuFruit.add(pearItem);   //菜单添加菜单项
       menuFruit.addSeparator();  //在菜单添加分隔线
       menuFruit.add(appleMenu);  //菜单也可以添加菜单
       appleMenu.add(redAppleItem);  //菜单添加菜单项
       appleMenu.add(yellowAppleItem);  //菜单添加菜单项
       menubar.add(menuFruit); //菜单条添加menuFruit菜单
       setJMenuBar(menubar);   //窗口放置菜单条
    } 
}
