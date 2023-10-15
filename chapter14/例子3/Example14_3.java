import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
class CanvasMoon extends JPanel { 
   public void paint(Graphics g) {
       super.paint(g);
       Graphics2D g_2d=(Graphics2D)g;
       Rectangle2D rect=  new Rectangle2D.Double(0,0,500,300);
       g_2d.setColor(Color.black);
       g_2d.fill(rect);
       Ellipse2D moon= new Ellipse2D.Double(100,100,200,200);
       Ellipse2D earth= new Ellipse2D.Double(170,100,320,320);
       Area moonArea=new Area(moon);  
       Area earthArea=new Area(earth);
       moonArea.subtract(earthArea);   //moonArea±ä³ÉÔÂÑÀ
       AffineTransform trans=new  AffineTransform(); 
       trans.rotate(15.0*Math.PI/180,200,200);
       g_2d.setTransform(trans);
       g_2d.setColor(Color.white);
       g_2d.fill(moonArea); 
   }
}
public class Example14_3{
   public static void main(String args[]) {
      JFrame win = new JFrame();
      win.setSize(1000,600);
      win.add(new CanvasMoon());
      win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      win.setVisible(true);    
   }     
}
