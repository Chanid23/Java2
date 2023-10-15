import java.awt.*;
import javax.swing.*;
public class WindowView extends JFrame { 
    public JTextField inputText;
    public JTextArea textShow;
    public JButton button;
    PoliceListen listener;
    public WindowView() {
       init();
       setVisible(true);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    void init() {
       setLayout(new FlowLayout());
       Font font = new Font("����",Font.PLAIN,20);
       inputText = new JTextField(20); 
       inputText.setFont(font);
       button = new JButton("ȷ��");
       button.setFont(font);
       font = new Font("����",Font.BOLD,22);
       textShow = new JTextArea(9,30);
       textShow.setFont(font);
       listener = new PoliceListen();
       listener.setView(this);//����ǰ���ڴ��ݸ�listener��ϵĴ���
       inputText.addActionListener(listener);//inputText���¼�Դ,listener�Ǽ�����
       button.addActionListener(listener);//button���¼�Դ,listener�Ǽ�����
       add(inputText);
       add(button);
       add(new JScrollPane(textShow));
    }
}
