import java.awt.*;
import javax.swing.*;
import java.util.Arrays;
public class MyWindow extends JFrame  {
    JButton button; 
    JTextArea  showRedBall ;//��ź������
    int []  redNumber;
    MyWindow() {
       init();
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init() {
       button=new JButton("�õ�˫ɫ���Ʊ��һ�����"); 
       showRedBall = new JTextArea();
       showRedBall.setForeground(Color.red);
       add(button,BorderLayout.NORTH); 
       add(new JScrollPane(showRedBall),BorderLayout.CENTER); 
       button.addActionListener((e)->{
             redNumber = MyDialog.showRandomArrayDiolog
             (this,"�������","˫ɫ��Ի���",MyDialog.YES_NO_OPTION,33,6);
             if(redNumber!=null) {
               Arrays.sort(redNumber);
               showRedBall.append(Arrays.toString(redNumber)+"\n"); 
             } 
          });
      Font f = new Font("",Font.BOLD,28);
      SetFont.setFont(f,button,showRedBall);
   }
}
