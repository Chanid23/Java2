import javax.swing.*;
import java.awt.*;
public class WinTable extends JFrame  {
    JTable table;
    Object a[][];
    Object name[]={"����","Ӣ��ɼ�","��ѧ�ɼ�","�ܳɼ�"};
    JButton button;
    ButtonListener  buttonListener;
    WinTable() {
        a=new Object[8][4];
        for(int i=0;i<8;i++) {
           for(int j=0;j<4;j++) {
             if(j!=0)
                 a[i][j]="0";
             }
        }
        button=new JButton("����ÿ���ܳɼ�");
        buttonListener = new ButtonListener();
        buttonListener.setView(this);//����ǰ���ڴ��ݸ�buttonListener��ϵĴ���
        table=new JTable(a,name);
        table.setRowHeight(table.getRowHeight()+10);
        button.addActionListener(buttonListener);
        add(new JScrollPane(table),BorderLayout.CENTER);
        JLabel hint = new JLabel("�޸Ļ�¼�����ݺ�,��س�ȷ��");
        add(hint,BorderLayout.NORTH);
        add(button,BorderLayout.SOUTH);
        Font f = new Font("����",Font.PLAIN,22);
        SetFont.setFont(f,button,table,hint);
        setSize(800,500);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  } 
}