import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class LP extends JLayeredPane implements MouseListener,MouseMotionListener {
   JButton buttonTom,buttonJerry;
   int x,y,a,b,x0,y0;
   LP() {
      buttonTom=new JButton("用鼠标拖动Tom"); 
      buttonTom.addMouseListener(this);
      buttonTom.addMouseMotionListener(this);
      buttonJerry=new JButton("用鼠标拖动Jerry"); 
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
      x0=e.getX();     //获取鼠标在事件源中的位置坐标
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
         x=e.getX();     //获取鼠标在事件源中的位置坐标
         y=e.getY();
         a=a+x;
         b=b+y;
         com.setLocation(a-x0,b-y0);
      }
    }
}
