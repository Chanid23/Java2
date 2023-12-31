import java.awt.*;
import javax.swing.*;
import javax.swing.text.Document;
public class WindowDocument extends JFrame { 
   JTextArea inputText,showText; 
   JMenuBar menubar;
   JMenu menu;
   JMenuItem  itemCopy,itemCut,itemPaste; 
   TextListener textChangeListener;  //inputText的监视器
   HandleListener handleListener;  //itemCopy,itemCut,itemPaste的监视器
   WindowDocument() { 
      init();
      setLayout(new FlowLayout());
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
   }
   void init() {
      inputText = new JTextArea(10,28);
      showText = new JTextArea(10,28);
      showText.setLineWrap(true);       //文本自动回行
      showText.setWrapStyleWord(true);  //文本区以单词为界自动换行
      Font font = new Font("宋体",Font.PLAIN,25);
      inputText.setFont(font);
      showText.setFont(font);
      menubar=new JMenuBar(); 
      menu=new JMenu("编辑");   
      itemCopy=new JMenuItem("复制(C)");
      itemCut=new JMenuItem("剪切(T)");
      itemPaste=new JMenuItem("粘贴(P)");
      itemCopy.setAccelerator(KeyStroke.getKeyStroke('c'));//设置快捷方式
      itemCut.setAccelerator(KeyStroke.getKeyStroke('t'));
      itemPaste.setAccelerator(KeyStroke.getKeyStroke('p'));//设置快捷方式
      itemCopy.setActionCommand("copy");
      itemCut.setActionCommand("cut");
      itemPaste.setActionCommand("paste");
      menu.add(itemCopy);
      menu.add(itemCut);
      menu.add(itemPaste);
      menubar.add(menu);
      setJMenuBar(menubar);
      add(new JScrollPane(inputText));
      add(new JScrollPane(showText));
      textChangeListener = new TextListener();
      handleListener = new HandleListener(); 
      textChangeListener.setView(this);  
      handleListener.setView(this);
      Document document =inputText.getDocument();
      document.addDocumentListener(textChangeListener);//向文档注册监视器
      itemCopy.addActionListener(handleListener);  //向菜单项注册监视器
      itemCut.addActionListener(handleListener);
      itemPaste.addActionListener(handleListener);
   }
}
