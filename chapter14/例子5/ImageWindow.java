import javax.swing.*;
import java.awt.*;
public class ImageWindow extends JFrame{
   Toolkit toolkit;
   JTextField text;
   JButton button;
   JLabel showMess;
   Image  image;
   Dimension dimension; 
   public ImageWindow(){
      toolkit = Toolkit.getDefaultToolkit();
      image = toolkit.getImage("ok.jpg");
      init();
   }
   public void init(){
      setTitle("´°¿ÚµÄ±³¾°Í¼");
      setLayout(new FlowLayout()); 
      text = new JTextField(20);
      showMess = new JLabel("ÊäÈë±³¾°Í¼ÏñµÄÃû×Ö£¬ÀýÈçsun.jpg");
      button = new JButton("¸ü»»Í¼Ïñ");
      text = new JTextField(20);
      add(showMess);
      add(text);
      add(button);
      button.addActionListener((e)->
                   { image=toolkit.getImage(text.getText());
                     repaint();
                   });
      setVisible(true); 
      dimension = toolkit.getScreenSize();
      setBounds(0,0,dimension.width,dimension.height);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
   }
   public void paint(Graphics g){
      super.paint(g); 
      g.drawImage(image,0,0,dimension.width,dimension.height,this);
      button.repaint();
      text.repaint();
      showMess.repaint();
   }
}