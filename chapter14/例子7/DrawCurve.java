import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.geom.*;
public class DrawCurve implements Drawer {//负责绘制曲线
   public BufferedImage getImage(){
        int width=600, height=300;
        QuadCurve2D  curve=
        new QuadCurve2D.Double (0,0,width/2,2*height,width,0);
        BufferedImage image = 
        new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setColor(Color.pink);//g默认用白色绘制图形
        g.fillRect(0,0,width, height);
        Graphics2D g_2d =(Graphics2D)g;
        g_2d.setColor(Color.blue);
        BasicStroke bs = 
        new BasicStroke(3f,BasicStroke.CAP_SQUARE,
                        BasicStroke.JOIN_ROUND);
        g_2d.setStroke(bs);
        g_2d.draw(curve); 
        return image;
   }
}