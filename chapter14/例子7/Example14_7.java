import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
public class Example14_7 {
   public static void main(String args[]) {
       File file = new File("curve.bmp"); // Ä¿µÄµØ
       try{  
          Drawer draw= new  DrawCurve();
          BufferedImage image = draw.getImage();
          ImageIO.write(image,"bmp",file);
       }
       catch(IOException e) { }
   }
}
