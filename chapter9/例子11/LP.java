import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class LP extends JLayeredPane implements MouseListener,MouseMotionListener {
   JButton buttonTom,buttonJerry;
   int x,y,a,b,x0,y0;
   LP() {
      buttonTom=new JButton("������϶�Tom"); 
      buttonTom.addMouseListener(this);
      buttonTom.addMouseMotionListener(this);
      buttonJerry=new JButton("������϶�Jerry"); 
      buttonJerry.addMouseListener(this);
      buttonJerry.addMouseMotionListener(this);
      setLayout(new FlowLayout());
      add(buttonTom,JLayeredPane.DEFAULT_LAYER);
      add(buttonJerry,JLayeredPane.DEFAULT_LAYER); 
  }
  public void mousePressed(MouseEvent e) {
      JComponent com=null;
      com=(JComponent)e.getSource(); 
      setLayer(com,JLayeredPane.DRAG_LAYER);
      a=com.getBounds().x;
      b=com.getBounds().y;
      x0=e.getX();     //��ȡ������¼�Դ�е�λ������
      y0=e.getY();
  }
  public void mouseReleased(MouseEvent e) {
      JComponent com=null;
      com=(JComponent)e.getSource(); 
      setLayer(com,JLayeredPane.DEFAULT_LAYER);
  }
  public void mouseEntered(MouseEvent e)  {}
    public void mouseExited(MouseEvent e) {}
    public void mouseClicked(MouseEvent e){}
    public void mouseMoved(MouseEvent e){} 
    public void mouseDragged(MouseEvent e) {
      Component com=null;
      if(e.getSource() instanceof Component) {
         com=(Component)e.getSource(); 
         a=com.getBounds().x;        
         b=com.getBounds().y;
         x=e.getX();     //��ȡ������¼�Դ�е�λ������
         y=e.getY();
         a=a+x;
         b=b+y;
         com.setLocation(a-x0,b-y0);
      }
    }
}
