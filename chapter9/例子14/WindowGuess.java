import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WindowGuess extends JFrame implements ActionListener {
   int number; //���Ҫ�²����
   byte count; //�û��²�Ĵ���
   JLabel hintLabel;
   JTextField inputGuess;
   JButton buttonGetNumber,buttonEnter;   
   public WindowGuess() {
       number = (int)(Math.random()*100)+1;
       setLayout(new FlowLayout());
       buttonGetNumber = new JButton("�õ�һ�������(1��100)");
       add(buttonGetNumber);
       hintLabel = new JLabel("������Ĳ²⣺",JLabel.CENTER);
       hintLabel.setBackground(Color.cyan);
       inputGuess = new JTextField(10); 
       add(hintLabel);
       add(inputGuess);
       buttonEnter = new JButton("ȷ��"); 
       add(buttonEnter); 
       buttonEnter.addActionListener(this);//��ǰ������������
       buttonGetNumber.addActionListener((e)->{
                        number = (int)(Math.random()*100)+1;
                        count = 0;
                        hintLabel.setText("������Ĳ²⣺");
                        inputGuess.setText(null);
                        buttonEnter.setEnabled(true);
                      });//Lambada���ʽ��������
       Font font = new Font("����",Font.PLAIN,30);
       SetFont.setFont(font,hintLabel,buttonEnter,buttonGetNumber,inputGuess);
       setBounds(100,100,150,150);
       setVisible(true);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       validate();
    }
    public void actionPerformed(ActionEvent e) {
        buttonGetNumber.setEnabled(false);
        int guess = 0;
        try {  guess=Integer.parseInt(inputGuess.getText());
               count++;
               if(guess==number) {
                  hintLabel.setText("�¶���(�²����:"+count+")");
                  buttonEnter.setEnabled(false);
                  buttonGetNumber.setEnabled(true);
               }
               else if(guess>number) {
                  hintLabel.setText("�´���(�²����:"+count+")");
                  inputGuess.setText(null); 
               }
               else if(guess<number) {
                  hintLabel.setText("��С��(�²����:"+count+")");
                  inputGuess.setText(null); 
               }
        }
        catch(NumberFormatException event) {
              hintLabel.setText("�����������ַ�");
        } 
   }
}