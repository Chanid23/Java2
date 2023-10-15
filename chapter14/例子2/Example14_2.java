import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
class MyCanvs extends JPanel { 
   public void paint(Graphics g) {
      super.paint(g);
      Graphics2D g_2d=(Graphics2D)g;
      Ellipse2D ellipse= new Ellipse2D.Double (130,130,600,400);
      AffineTransform trans=new  AffineTransform(); 
      for(int i=1;i<=24;i++){
         trans.rotate(15.0*Math.PI/180,430,330);
         g_2d.setTransform(trans);
         g_2d.draw(ellipse);  //现在画的就是旋转后的椭圆
     }
  }
}
public class Example14_2{
   public static void main(String args[]) {
      JFrame win = new JFrame();
      win.setSize(900,600);
      win.add(new MyCanvs());
      win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      win.setVisible(true);    
   }     
}
