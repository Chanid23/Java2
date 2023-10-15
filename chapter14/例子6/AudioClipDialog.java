import javax.sound.sampled.*;
import java.awt.*; 
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
public class AudioClipDialog extends JDialog implements ActionListener {
   JComboBox<String> choiceMusic;
   Clip clip;
   AudioInputStream stream;
   File voiceFile;
   JButton buttonPlay,
           buttonLoop,
           buttonStop;
   AudioClipDialog() {
     try{
       clip = AudioSystem.getClip(); 
     }
     catch(Exception exp){}
     choiceMusic=new JComboBox<String>();
     choiceMusic.addItem("选择音频文件");
     choiceMusic.addItem("ding.wav");
     choiceMusic.addItem("notify.wav");
     choiceMusic.addItem("online.wav");
     choiceMusic.setSelectedIndex(0);
     choiceMusic.addActionListener(this);
     buttonPlay=new JButton("播放");
     buttonLoop=new JButton("循环");
     buttonStop=new JButton("停止");
     buttonPlay.addActionListener(this);
     buttonStop.addActionListener(this);
     buttonLoop.addActionListener(this); 
     setLayout(new FlowLayout());
     add(choiceMusic);
     add(buttonPlay);
     add(buttonLoop);
     add(buttonStop);
     setSize(350,120);
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
   public void itemStateChanged(ItemEvent e) {
      clip.close();
      try{
           String musicName=
           choiceMusic.getSelectedItem().toString();
           voiceFile = new File(musicName);
           clip.open(stream);//打开音频流
      }
      catch(Exception exp){}
   }
   public void actionPerformed(ActionEvent e) {
      if(e.getSource()==buttonPlay){
          if(!clip.isRunning()){
             try{
               clip = AudioSystem.getClip();
               stream=AudioSystem.getAudioInputStream(voiceFile);
               clip.open(stream);//打开音频流
             }
             catch(Exception exp){}
          }
          clip.start();
      }
      else if(e.getSource()==buttonLoop){
          clip.loop(-1);
      }
      else if(e.getSource()==buttonStop)
          clip.stop();
      else if(e.getSource()==choiceMusic){
           clip.close();
           try{
             String musicName=
             choiceMusic.getSelectedItem().toString();
             voiceFile = new File(musicName);
             stream=AudioSystem.getAudioInputStream(voiceFile);
             clip.open(stream);//打开音频流
           }
           catch(Exception exp){}
      }
   }
}

