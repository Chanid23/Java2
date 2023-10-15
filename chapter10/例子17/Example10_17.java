import java.io.*;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.Color;
import java.awt.image.BufferedImage; 
public class Example10_17 {
   public static void main(String args[]) {
       File fileRead = new File("image/pic.jpg"); //Դ
       File fileWriteOne = new File("image/java.bmp"); // Ŀ�ĵ�
       File fileWriteTwo = new File("image/java.jpg"); // Ŀ�ĵ�      
       try{  
          BufferedImage image = ImageIO.read(fileRead);
          Graphics2D g = image.createGraphics();
          int width = image.getWidth();
          int height = image.getHeight();
          Font font = new Font("����",Font.BOLD,56);
          g.setFont(font);
          g.setColor(Color.blue);
          g.drawString("��ϲ��Java",width/2,height/2);
          ImageIO.write(image,"bmp",fileWriteOne);
          ImageIO.write(image,"jpg",fileWriteTwo);
       }
       catch(IOException e) {
          System.out.println("Error "+e);
       }
   }
}
