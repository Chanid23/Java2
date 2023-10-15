import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.*;
public class MusicButton extends JButton implements ActionListener {
      Clip clip;
      AudioInputStream stream;
      String musicName;
      MusicButton() {
           try{
              clip = AudioSystem.getClip();
           }
           catch(Exception exp){}
           addActionListener(this);
      }
      public void actionPerformed(ActionEvent exp) {
          File voiceFile=new File(musicName);
          if(!clip.isRunning()){
             try{
               clip = AudioSystem.getClip();
               stream=AudioSystem.getAudioInputStream(voiceFile);
               clip.open(stream);//´ò¿ªÒôÆµÁ÷
             }
             catch(Exception e){}
          }
          clip.start();
       }
      public void setClipFile(String name){
          musicName = name;
          String t=name.substring(0,name.indexOf("."));
          setText(""+t); 
          int M = JComponent.WHEN_IN_FOCUSED_WINDOW;
          registerKeyboardAction(this,KeyStroke.getKeyStroke(t),M);
      }
}