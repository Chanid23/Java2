import java.awt.*;
import javax.swing.*;
public class NumberView extends JFrame {
    public JTextField inputNumberOne,inputNumberTwo; 
    public JComboBox<String> choiceFuhao;
    public JTextArea textShow;
    public JButton button;
    public OperatorListener operator;//����ItemEvent�¼��ļ�����
    public ComputerListener computer;//����ActionEvent�¼��ļ�����
    public NumberView() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init() {
        setLayout(new FlowLayout());
        Font font = new Font("����",Font.BOLD,22);
        inputNumberOne = new JTextField(5);
        inputNumberTwo = new JTextField(5);
        inputNumberOne.setFont(font);
        inputNumberTwo.setFont(font);
        choiceFuhao = new JComboBox<String>();
        choiceFuhao.setFont(font);
        button = new JButton("����");
        button.setFont(font); 
        choiceFuhao.addItem("ѡ���������:");
        String [] a = {"+","-","*","/"};
        for(int i=0;i<a.length;i++) {
            choiceFuhao.addItem(a[i]);
        }
        choiceFuhao.setSelectedIndex(-1);//��ʼ״̬�б���û��ѡ�ѡ��
        textShow = new JTextArea(9,30);
        textShow.setFont(font);
        operator = new OperatorListener();
        computer = new ComputerListener();
        operator.setView(this);  //����ǰ���ڴ��ݸ�operator��ϵĴ���
        computer.setView(this);  //����ǰ���ڴ��ݸ�computer��ϵĴ���
        choiceFuhao.addItemListener(operator); //operator�Ǽ�����
        choiceFuhao.addActionListener(operator); //operator�Ǽ�����
        button.addActionListener(computer);//computer�Ǽ�����
        add(inputNumberOne);
        add(choiceFuhao);
        add(inputNumberTwo);
        add(button);
        add(new JScrollPane(textShow));
   }
}
